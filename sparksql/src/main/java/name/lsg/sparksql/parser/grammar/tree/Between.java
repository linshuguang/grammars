package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class Between extends Predicate {
    AST lower;
    AST upper;

    public Between(boolean not, AST lower, AST upper){
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public void confess(Context context){
        runConfess(context, "between");
        runConfess(context, lower);
        runConfess(context, "and");
        runConfess(context, upper);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("between"));
        IndentHelper.indent(context, lower);
        IndentHelper.indent(context, IndentHelper.keyword("and"));
        IndentHelper.indent(context, upper);
    }
}