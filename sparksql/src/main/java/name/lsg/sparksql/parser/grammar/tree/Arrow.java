package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.context.ContextFactory;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/2.
 */
public class Arrow extends AST {
    AST left;
    AST right;

    public Arrow(AST left, AST right){
        this.left = left;
        this.right = right;
    }

    @Override
    public void indent(Context context){

        IndentHelper.indent(context, left);
        IndentHelper.indent(context, "->");
        IndentHelper.indent(context, right);
    }
}
