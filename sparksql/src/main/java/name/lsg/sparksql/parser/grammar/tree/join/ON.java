package name.lsg.sparksql.parser.grammar.tree.join;

import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class ON extends AST {

    AST expr;

    public ON(AST expr){
        this.expr = expr;
    }


    @Override
    public void confess(Context context){

        runConfess(context, "on");
        runConfess(context, expr);
    }

    @Override
    public void indent(Context context){

        IndentHelper.indent(context, IndentHelper.keyword("on"));
        IndentHelper.indent(context, expr);
    }

}
