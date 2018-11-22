package name.lsg.parser;

import name.lsg.Parser;
import name.lsg.grammar.context.Context;
import name.lsg.grammar.context.ContextFactory;
import name.lsg.grammar.context.ContextParam;
import name.lsg.grammar.tree.AST;
import name.lsg.util.CompilerUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
public class TestParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestParser.class);



    private AST run(String sql){
        Parser parser = new Parser();
        System.out.println("to run:"+sql);
        return parser.parse(sql);
    }

    private AST assertNotNULL(String sql){
        AST result = run(sql);
        assert (result!=null);
        System.out.println("yes, result is not null");
        return result;
    }

    private void ident(AST ast){
        ContextParam param = ContextFactory.createParam();
        param.setOut(System.out);
        Context context = ContextFactory.create(param);
        ast.ident(context);
    }

    private AST procedure(String sql){
        AST result = assertNotNULL(sql);
        ident(result);
        return result;
    }

    @Test
    public void TestCase(){
        assertNotNULL("selECt a from t");
        assertNotNULL("select a from t");
    }

    @Test
    public void TestIdent(){
        AST result = assertNotNULL("select a     from        t");
        ident(result);
    }

    @Test
    public void TestWhere(){
        AST result = assertNotNULL("select a from t  where t.date > '2016-01-01' and amount=1000 or t.date = '2016-01-02' order by Txx");
        ident(result);
    }

    @Test
    public void TestDistict(){
        procedure("select distinct a from d.t");
    }

    @Test
    public void TestFunction(){
        procedure("select sum(prin)*0.01 from contract where from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMMdd\")<=20151231");
     }

    @Test
    public void TestGroupOrder(){
        procedure("select from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMMdd\") as pay_date from loan_contract\n" +
                "where from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMMdd\") between 20180901 and 20181031\n" +
                "group by 1 order by 1");
        //procedure("select sum(prin)*0.01 from contract where from_unixtime(cast(effectivetime/1000 ),\"yyyyMMdd\")<=20151231");
    }

    @Test
    public void TestNotIN(){
        procedure("select distinct termnum from  ctrl_info where productid not in (6,9,10) \n" +
                " or groupid in (10) \n" +
                "and from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMMdd\")>=20180801");
    }

    @Test
    public void TestCaseWhen(){
        procedure("select distinct b.contract_id,\n" +
                " case when b.ovd_days between 1 and 30 then \"M1\"\n" +
                " when b.ovd_days between 31 and 60 then \"M2\"\n" +
                " when b.ovd_days between 61 and 90 then \"M3\"\n" +
                " when b.ovd_days >= 91 then \"M4+\" else \"M0\" end as ovd,\n" +
                " b.unpaid_prin*0.01 as balance\n" +
                " from contract b");
    }

    @Test
    public void TestComplicate(){
        procedure(" select a.end_month,a.current_month,a.ovd,sum(a.balance) from \n" +
                "( select * from ttt) a\n" +
                " group by a.end_month,a.current_month,a.ovd \n" +
                " order by a.end_month,a.current_month,a.ovd");
    }

    @Test
    public void TestComplicate1(){
        procedure("select distinct b.contract_id,from_unixtime(cast(if(b.int_type=5,c.accounttime,b.end_time)/1000 as bigint),\"yyyyMM\") as end_month,\n" +
                " from_unixtime(cast(b.basic_date/1000-60*60*24 as bigint),\"yyyyMM\") as current_month,\n" +
                " case when b.ovd_days between 1 and 30 then \"M1\"\n" +
                " when b.ovd_days between 31 and 60 then \"M2\"\n" +
                " when b.ovd_days between 61 and 90 then \"M3\"\n" +
                " when b.ovd_days >= 91 then \"M4+\" else \"M0\" end as ovd,\n" +
                " b.unpaid_prin*0.01 as balance\n" +
                " from mt.contract b left join \n" +
                " (select mid,max(accounttime) accounttime from mt.preservation group by mid) c \n" +
                " on b.m_id=c.mid \n" +
                " where b.date=20181001 and b.basic_trade_code=4 and b.basic_accrual_status = 1\n" +
                " and b.basic_rule_id in (3,13) and b.basic_owner in (3,13)");
    }




    @Test
    public void TestCook(){
        AST result = assertNotNULL("select a from t  where t.date > '2016-01-01' and amount=1000 or t.date = '2016-01-02' order by Txx");

        ContextParam param = ContextFactory.createParam();
        Context context = ContextFactory.create(param);
        result.confess(context);
        System.out.println("ident sql: "+context.getConfess());
        System.out.println("predicate:");
        context.confessPredicates();
    }

    /*

    @Test
    public void TestSubQuery(){
        Parser parser = new Parser();
        String sql = "select a from t, (select a,b from foo where foo.date= '2016-01-01')  where t.date > '2016-01-01' and amount=1000 or t.date = '2016-01-02' order by Txx";
        System.out.println("to run : "+sql);
        AST result = parser.parse(sql);
        assert (result!=null);

        Context context = ContextFactory.produce();
        result.confess(context);
        System.out.println("cooked sql: "+context.getConfess());
        System.out.println("predicate:");
        context.confessPredicates();
    }


    @Test
    public void TestGroupBy(){
        Parser parser = new Parser();
        String sql = "select basic_rule_id, basic_owner, sum(cur_st_total_prin) from t where basic_trade_code = 4 and t.date='2018-05-01' and t.date='2018-05-03' and t.date='2018-05-10' group  by  basic_rule_id, basic_owner";
        System.out.println("to run : "+sql);
        AST result = parser.parse(sql);
        assert (result!=null);

        Context context = ContextFactory.produce();
        result.confess(context);
        System.out.println("cooked sql: "+context.getConfess());
        System.out.println("predicate:");
        context.confessPredicates();
    }
    */


    @Test
    public void TestPredicators(){

        String sql = "select basic_rule_id, basic_owner, sum(cur_st_total_prin) from t where basic_trade_code = 4 and t.date='2018-05-01' and t.date='2018-05-03' and t.date='2018-05-10' group  by  basic_rule_id, basic_owner";

        List<String> candidateDates = new ArrayList<>();
        candidateDates.add("2018-05-01");
        candidateDates.add("2018-05-02");
        candidateDates.add("2018-05-03");
        candidateDates.add("2018-05-04");
        CompilerUtils.grill(sql, candidateDates);
    }
}
