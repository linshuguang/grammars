package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class AND extends AST {
    AST left;
    AST right;

    public AND(AST left, AST right){
        this.left = left;
        this.right = right;
    }

    @Override
    public void confess(Context context){
        runConfess(context,left);
        runConfess(context,"and");
        runConfess(context, right);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,left);
        IndentHelper.indent(context, IndentHelper.keyword("and"));
        IndentHelper.indent(context, right);
    }
}
