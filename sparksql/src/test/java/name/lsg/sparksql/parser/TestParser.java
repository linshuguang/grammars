package name.lsg.sparksql.parser;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.context.ContextFactory;
import name.lsg.sparksql.parser.grammar.context.ContextParam;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.CompilerUtils;
import name.lsg.sparksql.parser.util.ConsoleUtils;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
public class TestParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestParser.class);



    @Test
    public void TestCase(){
        procedure("selECt a from t");
        procedure("select a from t");
    }

    @Test
    public void TestIdent(){
        procedure("select a     from        t");
    }

    @Test
    public void TestWhere(){
        procedure("select a from t  where t.date > '2016-01-01' and amount=1000 or t.date = '2016-01-02' order by Txx");
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
                " from t.contract b left join \n" +
                " (select mid,max(accounttime) accounttime from t.preservation group by mid) c \n" +
                " on b.m_id=c.mid \n" +
                " where b.date=20181001 and b.trade=4 and b.accrual = 1\n" +
                " and b.rule in (3,13) and b.owner in (3,13)");
    }

    @Test
    public void TestBracket(){
        procedure("select sum(prin)*0.01 from contract where  \n" +
                "from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMMdd\")<=20251231 \n" +
                "and  (rule in (0,2) or (ruleid in (1,2,3) and prinsecond>0))");
    }

    @Test
    public void TestCaseAvgRate(){
        procedure("select a.rate,count(distinct a.cid) as cnt from \n" +
                "(select distinct cid,rate \n" +
                " from m.contract  \n" +
                " where date=20380101 and code=1\n" +
                " and rid in (0,2) \n" +
                " and o not in (1,3) \n" +
                " and unpaid>0\n" +
                ") a group by 1 order by 1");
    }

    @Test
    public void TestTableAlias(){
        procedure("select * from t b");
        procedure("select * from (t) b");
        procedure("select * from (select a,b,c from t) b");
    }

    @Test
    public void TestWeightedAvgRate(){
        procedure("select a.month,sum(a.rate*a.cnt)/sum(a.cnt) weight_avg_rate from \n" +
                "(select from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMM\") as month,rate,count(distinct id) as cnt \n" +
                "from  contract\n" +
                "where productid not in (6,9) and  from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMM\") between 203801 and 203808 group by 1,2 order by 1,2) as a  \n" +
                "group by 1 order by 1 ");
    }

    @Test
    public void TestComplicate2(){
        procedure("select from_unixtime(cast(b.effectivetime/1000 as bigint),\"yyyyMM\") as p_month,\n" +
                "from_unixtime(cast(a.accountTime/1000 as bigint),\"yyyyMM\") as c_month,\n" +
                "sum(a.amount)/100 as f_prin \n" +
                "from (select distinct id,conid,accountTime,rid,amount from m.detail\n" +
                "where repaytype in (9,13,23,24,25) and from_unixtime(cast(accountTime/1000 as bigint),\"yyyyMM\") between 203801 and 203811  and productid not in (6,9)) as a\n" +
                "join (select distinct id,prin,effectivetime from m.contract where from_unixtime(cast(effectivetime/1000 as bigint),\"yyyyMM\") between 201801 and 201811 and productid not in (6,9)) as b on a.conid=b.id\n" +
                "group by 1,2 order by 1,2");
    }

    @Test
    public void TestLefJoin(){
        procedure(" select from_unixtime(cast(if(b.int_type=2,c.accounttime,b.basic_end_time)/1000 as bigint),\"yyyyMM\") as end_month,b.cid \n" +
                " from m.contract b left join m.preservation c \n" +
                " on b.m_id=c.mid \n" +
                " where b.date=20380801 and b.code=4 and b.status = 1 and b.rid in (0,3) and b.owner not in (3333,16) and b.int_type=5");
    }

    @Test
    public void TestComplicate3(){
        procedure("select \n" +
                "c.ovd_t,\n" +
                "sum(if(c.ovd2=\"M1\" and c.ovd1=\"M0\",c.balance2,0)) as m01,\n" +
                "sum(if(c.ovd2=\"M2\" and c.ovd1=\"M0\",c.balance2,0)) as m02,\n" +
                "sum(if(c.ovd2=\"M3\" and c.ovd1=\"M0\",c.balance2,0)) as m03,\n" +
                "sum(if(c.ovd2=\"M4+\" and c.ovd1=\"M0\",c.balance2,0)) as m04,\n" +
                "sum(if(c.ovd2=\"M2\" and c.ovd1=\"M1\",c.balance2,0)) as m12,\n" +
                "sum(if(c.ovd2=\"M3\" and c.ovd1=\"M1\",c.balance2,0)) as m13,\n" +
                "sum(if(c.ovd2=\"M4+\" and c.ovd1=\"M1\",c.balance2,0)) as m14,\n" +
                "sum(if(c.ovd2=\"M3\" and c.ovd1=\"M2\",c.balance2,0)) as m23,\n" +
                "sum(if(c.ovd2=\"M4+\" and c.ovd1=\"M2\",c.balance2,0)) as m24,\n" +
                "sum(if(c.ovd2=\"M4+\" and c.ovd1=\"M3\",c.balance2,0)) as m34,\n" +
                "sum(if(c.ovd2=\"M1\" and c.ovd1=\"M2\",c.balance2,0)) as m21,\n" +
                "sum(if(c.ovd2=\"M2\" and c.ovd1=\"M3\",c.balance2,0)) as m32,\n" +
                "sum(if(c.ovd2=\"M1\" and c.ovd1=\"M3\",c.balance2,0)) as m31,\n" +
                "sum(if(c.ovd2=\"M3\" and c.ovd1=\"M4+\",c.balance2,0)) as m43,\n" +
                "sum(if(c.ovd2=\"M2\" and c.ovd1=\"M4+\",c.balance2,0)) as m42,\n" +
                "sum(if(c.ovd2=\"M1\" and c.ovd1=\"M4+\",c.balance2,0)) as m41,\n" +
                "sum(if(c.ovd1 is null,c.balance2,0)) as balanceadd,\n" +
                "sum(if(c.balance2 is null,c.balance1,c.balance1-c.balance2)) as balancesub \n" +
                "from \n" +
                "(\n" +
                "\tselect \n" +
                "\t\tdistinct if(a.contract_id is null,b.contract_id,a.contract_id) as  contract_id_t,\n" +
                "\t\tif(a.ovd2 is null,b.ovd1,a.ovd2)  as ovd_t,a.ovd2,\n" +
                "\t\ta.balance2,\n" +
                "\t\tb.ovd1,\n" +
                "\t\tb.balance1 \n" +
                "\tfrom  \n" +
                "\t\t(select \n" +
                "\t\t\tdistinct contract_id,\n" +
                "\t\t\tcase when overdue_days between 1 and 30 then \"M1\"\n" +
                "\t\t\twhen overdue_days between 31 and 60 then \"M2\"\n" +
                "\t\t\twhen overdue_days between 61 and 90 then \"M3\"\n" +
                "\t\t\twhen overdue_days >= 91 then \"M4+\" else \"M0\" end as ovd2,\n" +
                "\t\t\tcur_st_total_unpaid_prin*0.01 as balance2\n" +
                "\t\tfrom \n" +
                "\t\t\tm.contract  \n" +
                "\t\twhere \n" +
                "\t\t\tdate=20380701 and code=4  and unpaid>0 and status=1 and rid in (2,3) and owner not in (1,3)\n" +
                "\t\t)a \n" +
                "\t\tfull join \n" +
                "\t\t(select \n" +
                "\t\t\tdistinct contract_id,case when overdue_days between 1 and 30 then \"M1\"\n" +
                "\t\t\twhen overdue_days between 31 and 60 then \"M2\"\n" +
                "\t\t\twhen overdue_days between 61 and 90 then \"M3\"\n" +
                "\t\t\twhen overdue_days >= 91 then \"M4+\" else \"M0\" end as ovd1,\n" +
                "\t\t\tunpaid*0.01 as balance1\n" +
                "\t\tfrom \n" +
                "\t\t\tm.contract  \n" +
                "\t\twhere date=20380101 and code=4  and unpaid>0 and status=1 and rid in (2,3) and owner not in (1)\n" +
                "\t\t)b\t\t\t\n" +
                "\t\ton a.contract_id=b.contract_id\n" +
                " ) c \n" +
                " \n" +
                " group by c.ovd_t \n" +
                " order by c.ovd_t");
    }

    @Test
    public void TestUse() {
        procedure("use Table");
    }


    @Test
    public void TestWith() {
        procedure("WITH EXP AS (SELECT  ALIASNAME.ID+1 ID, ALIASNAME.NAME NAME FROM employee_1 ALIASNAME)\n" +
                "     SELECT * FROM EXP");
        procedure("WITH EXP (SELECT  ALIASNAME.ID+1 ID, ALIASNAME.NAME NAME FROM employee_1 ALIASNAME)\n" +
                "     SELECT * FROM EXP");
    }

    @Test
    public void TestExists() {
        procedure("select a,b,c\n" +
                "  from A, B, C\n" +
                "where\n" +
                "  A.FK_1 = B.PK and\n" +
                "  A.FK_2 = C.PK and\n" +
                "  exists (select A.ID )");
        //procedure("WITH EXP (SELECT  ALIASNAME.ID+1 ID, ALIASNAME.NAME NAME FROM employee_1 ALIASNAME)\n" +
        //        "     SELECT * FROM EXP");
    }

    @Test
    public void TestStruct() {
        procedure("select struct(a,1,2)");
    }

    @Test
    public void TestFirst() {
        procedure("select \n first( (*) )");
        procedure("select first( (*) ignore nulls)");
    }

    @Test
    public void TestLast() {
        procedure("select \n last( (*) )");
        procedure("select last( (*) ignore nulls)");
    }

    @Test
    public void TestPosition() {
        procedure("select position(  bcd in (*) )");
    }

    @Test
    public void TestCreateDatabase() {
        procedure("CREATE DATABASE IF not EXIStS mysparkdb comment \"hello world\" LOCATION '/home/prashant/mysparkdb/' WITH DBPROPERTIES(key1=1, key2='hi')");
    }

    @Test
    public void TestAlterDatabase() {
        procedure("alter DATABASE mysparkdb set DBPROPERTIES(key1=2, key2='ha',key3=0000000)");
    }

    @Test
    public void TestDropDatabase() {
        procedure("drop DATABASE IF EXISTS mysparkdb ");
        procedure("drop DATABASE IF EXISTS mysparkdb CASCADE");
    }

    @Test
    public void TestCreateTable() {
        procedure(" CREATE TABLE IF NOT EXISTS mysparkdb.hive_surveys(\n" +
                "        TIME_STAMP TIMESTAMP, \n" +
                "        AGE LONG, \n" +
                "        GENDER STRING, \n" +
                "        TECH_COMPANY STRING, \n" +
                "        COMMENTS STRING)\n" +
                "    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde' \n" +
                "    STORED AS TEXTFILE ");
        procedure(" CREATE TABLE IF NOT EXISTS mysparkdb.hive_surveys(\n" +
                "        TIME_STAMP TIMESTAMP, \n" +
                "        AGE LONG, \n" +
                "        GENDER STRING, \n" +
                "        TECH_COMPANY STRING, \n" +
                "        COMMENTS STRING)\n" +
                "    ROW FORMAT DELIMITED FIELDS TERMINATED BY 'hello'ESCAPED BY 'world' \n" +
                "    STORED AS TEXTFILE ");
        procedure("CREATE TABLE tablename \n" +
                "    STORED AS PARQUET LOCATION 'some/location/incase/of/external/table' \n" +
                "AS\n" +
                "SELECT *\n" +
                "    FROM source_table\n" +
                "WHERE 1=1");
    }


    @Test
    public void TestCreateTableLike() {
        procedure("CREATE TABLE if not exists tablename LIKE db_name.table_name2 LOCATION  'hdfs_path_of_parquet_file'");
    }

    @Test
    public void TestAnalyze() {
        procedure("ANALYZE TABLE t1 COMPUTE STATISTICS FOR COLUMNS id, p1, p2");
    }

    @Test
    public void TestAddColumn() {
        procedure("ALTER TABLE tablename ADD COLUMNS (newColumn newDataType comment 'ok')");
    }

    @Test
    public void TestRenameTable() {
        procedure("alter table d1.mobile rename to mobile");
    }

    @Test
    public void TestSetTBLPROPERTIES() {
        procedure("ALTER TABLE table_name SET TBLPROPERTIES ('auto.purge'='true');");
    }

    @Test
    public void TestUnSetTBLPROPERTIES() {
        procedure("ALTER VIEW table1 UNSET TBLPROPERTIES IF EXISTS ('key1', 'key2', 'key3')");
    }

    @Test
    public void TestArray(){
        procedure("create temporary view data as select * from values\n" +
                "  (\"one\", array(11, 12, 13), array(array(111, 112, 113), array(121, 122, 123))),\n" +
                "  (\"two\", array(21, 22, 23), array(array(211, 212, 213), array(221, 222, 223)))\n" +
                "  as data(a, b, c)");
    }





    @Test
    public void TestSQLs() {
        //final String CONFIG_FILE = "/sql-tests/inputs/typeCoercion";
        final String CONFIG_FILE = "/sql-tests/inputs";
        URL fileUrl = getClass().getResource(CONFIG_FILE);
        File node = new File(fileUrl.getFile());
        displayIt(node);
    }


    private boolean tryOn = true;

    private void visit(File node){
        try {
            System.out.println(node.getAbsolutePath());
            String code = complete(fileGetContent(node));
            ConsoleUtils.stdout("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            ConsoleUtils.stdout("to run:\n");
            ConsoleUtils.green((code));
            ConsoleUtils.stdout("\n");

            List<AST> astList = CompilerUtils.runBatch(code);
            StringBuilder sbuf = new StringBuilder();
            for (int i = 0; i< astList.size(); i++) {
                AST ast = astList.get(i);
                assert (ast != null);
                ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
                indent(ast,bOutput);
                String sql2 = bOutput.toString();
                if(i<astList.size()-1 || StringUtils.equalsIgnoreCase(sql2,";")){
                    sbuf.append(complete(sql2));
                }
                sbuf.append(" ");
            }
            ConsoleUtils.stdout("result:\n");
            ConsoleUtils.purple(sbuf.toString());
            ConsoleUtils.stdout("\n");
            assert (CompilerUtils.identSql(code,sbuf.toString())==true);
            ConsoleUtils.stdout("conclude:\n");
            ConsoleUtils.blue(("succeed"));
            ConsoleUtils.stdout("\n");
            if(tryOn) {
                System.exit(0);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
    }
    private void displayIt(File node){
        if(node.isDirectory()){
            String[] subNote = node.list();
            for(String filename : subNote){
                displayIt(new File(node, filename));
            }
        }else if(!node.getAbsolutePath().endsWith("blacklist.sql")){
            visit(node);
        }
    }

    private String complete(String str){
        String t = str.trim();
        if(t.endsWith(";")){
            return t+";";
        }else{
            return t;
        }
    }
    private AST procedure(String sql){

        ConsoleUtils.stdout("========================================================\n");
        ConsoleUtils.stdout("to run:\n");
        //ConsoleUtils.green(IndentHelper.frame(sql));
        ConsoleUtils.green((sql));
        ConsoleUtils.stdout("\n");

        AST result = assertNotNULL(sql);
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
        indent(result,bOutput);
        String sql2 = bOutput.toString();
        ConsoleUtils.stdout("result:\n");
        //ConsoleUtils.red(IndentHelper.frame(sql2));
        ConsoleUtils.purple((sql2));
        ConsoleUtils.stdout("\n");

        assert (CompilerUtils.identSql(sql,sql2));

        ConsoleUtils.stdout("conclude:\n");
        ConsoleUtils.blue(("succeed"));
        ConsoleUtils.stdout("\n");


        return result;
    }


    private String fileGetContent(File node) throws Exception{
        FileReader fr =
                new FileReader(node);
        int i;
        StringBuilder out = new StringBuilder();
        while ((i=fr.read()) != -1) {
            out.append((char) i);
        }
        fr.close();
        return out.toString();

    }

    private AST run(String sql){
        return CompilerUtils.run(sql);
    }


    private AST assertNotNULL(String sql){
        AST result = run(sql);
        assert (result!=null);
        return result;
    }

    private AST assertNULL(String sql){
        AST result = run(sql);
        assert (result==null);
        return result;
    }

    private void indent(AST ast, OutputStream out){
        ContextParam param = ContextFactory.createParam();
        param.setOut(out);
        Context context = ContextFactory.create(param);
        ast.indent(context);
    }
}
