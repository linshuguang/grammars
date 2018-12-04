package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/4.
 */
public class ExpressionFrameBound extends FrameBound {
    AST expr;

    public ExpressionFrameBound(AST expr, String boundType){
        super(boundType);
        this.expr = expr;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,expr);
        super.indent(context);
    }
}
