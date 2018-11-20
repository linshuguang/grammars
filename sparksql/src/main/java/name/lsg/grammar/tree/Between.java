package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

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
        IdentHelper.ident(context, "between");
        IdentHelper.ident(context, lower);
        IdentHelper.ident(context, "and");
        IdentHelper.ident(context, upper);
    }
}