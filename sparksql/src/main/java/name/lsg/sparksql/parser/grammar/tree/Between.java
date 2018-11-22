package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

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
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("between"));
        IdentHelper.ident(context, lower);
        IdentHelper.ident(context, IdentHelper.keyword("and"));
        IdentHelper.ident(context, upper);
    }
}