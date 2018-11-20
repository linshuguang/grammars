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

    @Test
    public void TestCase(){
        assertNotNULL("selECt a from t");
        assertNotNULL("select a from t");
    }

    @Test
    public void TestWhere(){
        assertNotNULL("select a from t  where t.date > '2016-01-01' and amount=1000 or t.date = '2016-01-02' order by Txx");
    }

    @Test
    public void TestIdent(){
        //AST result = assertNotNULL("select a from t  where t.date > '2016-01-01' and amount=1000 or t.date = '2016-01-02' order by Txx");
        AST result = assertNotNULL("select a     from        t");

        ContextParam param = ContextFactory.createParam();
        param.setOut(System.out);
        Context context = ContextFactory.create(param);
        result.ident(context);
        //System.out.println("ident sql: "+context.getConfess());
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
