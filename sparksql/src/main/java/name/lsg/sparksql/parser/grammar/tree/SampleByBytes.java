package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class SampleByBytes extends AST {
    AST expr;

    public SampleByBytes(AST expr){
        this.expr = expr;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, expr);
    }
}
