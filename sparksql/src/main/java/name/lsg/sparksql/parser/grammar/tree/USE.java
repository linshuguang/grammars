package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/27.
 */
public class USE extends AST {
    AST db;

    public USE(AST db){
        this.db = db;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("use"));
        IndentHelper.indent(context,db);
    }
}
