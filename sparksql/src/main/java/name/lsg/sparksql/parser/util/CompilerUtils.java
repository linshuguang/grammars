package name.lsg.sparksql.parser.util;


import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.context.ContextFactory;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.tree.BoolValue;
import name.lsg.sparksql.parser.Parser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.*;

/**
 * Created by kenya on 2018/11/13.
 */
public class CompilerUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompilerUtils.class);

    public static Map<String,Object> grill(String sql, Map<String, List<String>>candidateTables){
        return grill(ContextFactory.create(), sql, candidateTables);
    }

    public static Map<String,Object> grill(Context context, String sql, Map<String, List<String>>candidateTables){

        Map<String,Object> result = new HashMap<>();

        Parser parser = new Parser();
        LOGGER.info("sql-{}, ingredients-{} ",sql, candidateTables);
        AST ast = parser.parse(sql);
        ast.confess(context);

        String cookedSql = context.getConfess();
        result.put("cookedSql", cookedSql);
        LOGGER.info("cooked sql:{}", cookedSql);

        List<AST> predicates = context.getPredicates();

        Map<String,List<String>> qualifiedTables = new HashMap<>();

        for(Map.Entry<String,List<String>> entry: candidateTables.entrySet()){

            String table = entry.getKey();
            for(String date : entry.getValue()){
                Map<String,String> tempMap = new HashMap<>();
                tempMap.put(table, date);
                context.setTableMap(tempMap);
                boolean ok = false;
                for(AST predicate: predicates){
                    AST res = predicate.steam(context);

                    if(res ==null){
                        continue;
                    }

                    if(res instanceof BoolValue){
                        if(((BoolValue) res).toBoolean()){
                            ok = true;
                            break;
                        }
                    }
                }
                if(ok){
                    if(!qualifiedTables.containsKey(table)){
                        List<String> list = new ArrayList<>();
                        qualifiedTables.put(table, list);
                    }
                    qualifiedTables.get(table).add(date);
                }
            }
        }
        result.put("extracted", qualifiedTables);
        LOGGER.info("result:{}", result);
        return result;
    }




    public static Map<String,Object> grill(String sql, List<String>candidateDates){

        Context context = ContextFactory.create();
        Map<String,Object> result = new HashMap<>();

        Parser parser = new Parser();
        LOGGER.info("sql-{}, ingredients-{} ",sql, candidateDates.size());
        AST ast = parser.parse(sql);
        ast.confess(context);

        String cookedSql = context.getConfess();
        result.put("cookedSql", cookedSql);
        LOGGER.info("cooked sql:{}", cookedSql);

        List<AST> predicates = context.getPredicates();

        Set<String> predicators = new HashSet<>();

        for(AST predicate: predicates){
            String p = predicate.confessPredicator(context);
            if(StringUtils.isBlank(p)){
                continue;
            }
            predicators.add(p);
        }

        Map<String,List<String>> qualifiedTables = new HashMap<>();

        for(String table: predicators) {
            for (String date : candidateDates) {
                Map<String, String> tempMap = new HashMap<>();
                tempMap.put(table, date);
                context.setTableMap(tempMap);
                boolean ok = false;
                for (AST predicate : predicates) {
                    AST res = predicate.steam(context);

                    if (res == null) {
                        continue;
                    }

                    if (res instanceof BoolValue) {
                        if (((BoolValue) res).toBoolean()) {
                            ok = true;
                            break;
                        }
                    }
                }
                if (ok) {
                    if (!qualifiedTables.containsKey(table)) {
                        List<String> list = new ArrayList<>();
                        qualifiedTables.put(table, list);
                    }
                    qualifiedTables.get(table).add(date);
                }
            }
        }

        result.put("extracted", qualifiedTables);
        LOGGER.info("result:{}", result);
        return result;
    }

    public static boolean identSql(String sql1, String sql2){
        Parser parser = new Parser();
        return parser.identSQL(sql1, sql2);
    }

    public static AST run(String sql){
        Parser parser = new Parser();
        return parser.parse(sql);
    }

}
