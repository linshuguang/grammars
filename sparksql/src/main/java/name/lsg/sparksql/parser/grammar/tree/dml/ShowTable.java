package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ShowTable extends AST {
    String method ;
    AST db;
    String pattern;
    AST partitionSpec;

    public ShowTable(String method,AST db,String pattern,AST partitionSpec){
        this.method = method;
        this.db = db;
        this.pattern = pattern;
        this.partitionSpec = partitionSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"SHOW","TABLE","EXTENDED");
        if(db!=null){
            IndentHelper.indentKeyWord(context,method);
            IndentHelper.indent(context,db);
        }
        IndentHelper.indentKeyWord(context,"LIKE");
        IndentHelper.indent(context,pattern);
        IndentHelper.indent(context,partitionSpec);
    }
}
