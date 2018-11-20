package name.lsg.util;

import name.lsg.grammar.context.Context;
import name.lsg.grammar.tree.AST;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;

import java.util.List;

/**
 * Created by kenya on 2018/11/19.
 */
public class IdentHelper {
    private final static String MAGIC_IDENT = "ident";
    private static final String DEFAULT_DELIMETER = ",";

    public static void identKeyWord(Context context,String...messages){
        for(String msg: messages) {
            context.output(IdentHelper.keyword(msg));
        }
    }

    public static void ident(Context context, boolean uppper, String...messages){
        for(String msg: messages) {
            if(uppper) {
                context.output(msg.toUpperCase());
            }else{
                context.output(msg.toLowerCase());
            }
        }
    }

    public static void ident(Context context, String...messages){
        for(String msg: messages) {
            if(msg!=null) {
                context.output(msg);
            }
        }
    }

    public static void ident( Context context, AST ast){
        if(ast!=null)
            MagicUtils.call(ast, MAGIC_IDENT, context);
    }

    public static void ident( Context context, AST ast, String...alternatives){
        if(ast!=null) {
            ident(context, ast);
            ident(context, alternatives);
        }
    }

    public static void ident( Context context, List<AST> astList, String...alternatives){
        if(astList!=null && astList.size()>0) {
            ident(context, alternatives);
            ident(context, astList);
        }
    }

    public static void ident( Context context, List<AST> astList){
        if(astList!=null && astList.size()>0){
            for(int i = 0; i < astList.size(); i++ ){
                AST ast = astList.get(i);
                ident(context, ast);
                if( i < astList.size()-1){
                    context.output(DEFAULT_DELIMETER);
                }
            }
        }
    }

    public static String keyword(String word){
        String val = null;
        try {
            int i = MagicUtils.findIntValue(SqlBaseLexer.class, word.toUpperCase());
            val = SqlBaseLexer.ruleNames[i-1];
        }catch (Exception e){
            e.printStackTrace();
        }
        return val;
    }

}
