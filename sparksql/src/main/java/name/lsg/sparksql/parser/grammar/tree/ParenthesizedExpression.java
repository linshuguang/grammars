package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/22.
 */
public class ParenthesizedExpression extends AST {
    AST ast;
    public ParenthesizedExpression(AST ast){
        this.ast = ast;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, ast);
        IndentHelper.indent(context, ")");
    }
}
