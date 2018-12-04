package name.lsg.sparksql.parser.util;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.TreeSet;

/**
 * Created by kenya on 2018/11/19.
 */
public class IndentHelper {
    private final static String MAGIC_INDENT = "indent";
    private static final String DEFAULT_DELIMETER = ",";
    private static final Logger LOGGER = LoggerFactory.getLogger(IndentHelper.class);

    public static void indentKeyWord(Context context,String...messages){
        for(String msg: messages) {
            context.output(IndentHelper.keyword(msg));
        }
    }

    public static void indent(Context context, boolean uppper, String...messages){
        for(String msg: messages) {
            if(uppper) {
                context.output(msg.toUpperCase());
            }else{
                context.output(msg.toLowerCase());
            }
        }
    }

    public static void indent(Context context, String...messages){
        for(String msg: messages) {
            if(msg!=null) {
                context.output(msg);
            }
        }
    }

    public static void indent( Context context, AST ast){
        if(ast!=null)
            MagicUtils.call(ast, MAGIC_INDENT, context);
    }

    public static void indent( Context context, AST ast, String...alternatives){
        if(ast!=null) {
            indent(context, ast);
            indent(context, alternatives);
        }
    }

    public static void indent( Context context, List<AST> astList, String...alternatives){
        if(astList!=null && astList.size()>0) {
            indent(context, alternatives);
            indent(context, astList);
        }
    }


    public static void indentNoDelimeter( Context context, List<AST> astList){
        if(astList!=null && astList.size()>0){
            for(int i = 0; i < astList.size(); i++ ){
                AST ast = astList.get(i);
                indent(context, ast);
            }
        }
    }

    public static void indentWithDelimeter( Context context, List<AST> astList,String delimeter){
        if(astList!=null && astList.size()>0){
            for(int i = 0; i < astList.size(); i++ ){
                AST ast = astList.get(i);
                indent(context, ast);
                if( i < astList.size()-1){
                    context.output(delimeter);
                }
            }
        }
    }

    public static void indent( Context context, List<AST> astList){
        indentWithDelimeter( context, astList,DEFAULT_DELIMETER);
    }


    public static String keyword(String word){
        String val = null;
        try {
            int i = MagicUtils.findIntValue(SqlBaseLexer.class, word.toUpperCase());
            val = SqlBaseLexer.ruleNames[i-1];
        }catch (Exception e){
            LOGGER.error("weird keyword:{}",word);
            LOGGER.error(ExceptionUtils.getStackTrace(e));
            val = word;
        }
        return val;
    }

    private static String complete(String str, int len, char pad){
        char border = '*';
        char tab = ' ';
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(border);
        stringBuilder.append(tab);
        stringBuilder.append(str);
        for(int i = 0 ; i < (len - str.length()); i++){
            stringBuilder.append(pad);
        }
        stringBuilder.append(tab);
        stringBuilder.append(border);
        return stringBuilder.toString();
    }

    private static String complete(String str, int len){
        return complete(str, len, ' ');
    }

    private static String join(String [] split, int len){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append(complete("",len,'*'));
        stringBuilder.append("\n");
        for(int i=0; i < split.length; i++){
            stringBuilder.append(complete(split[i],len));
            stringBuilder.append("\n");
        }
        stringBuilder.append(complete("",len,'*'));
        return stringBuilder.toString();
    }
    public static String frame(String str){
        String []split = str.split("\n");
        TreeSet<Integer> len = new TreeSet<>();
        for(int i=0; i < split.length; i++){
            len.add(split[i].length());
        }
        return join(split, len.last());
    }

}
