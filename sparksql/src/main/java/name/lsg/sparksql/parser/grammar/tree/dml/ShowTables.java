package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ShowTables extends AST {

    String method;
    AST db;
    boolean like;
    String pattern;

    public ShowTables(String method,AST db,boolean like,String pattern){
        this.method = method;
        this.db = db;
        this.like = like;
        this.pattern = pattern;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "SHOW", "TABLES");
        if(db!=null){
            IndentHelper.indentKeyWord(context, method);
            IndentHelper.indent(context, db);
        }
        if(pattern!=null){
            if(like){
                IndentHelper.indentKeyWord(context, "like");
            }
            IndentHelper.indent(context, pattern);
        }
    }

}
