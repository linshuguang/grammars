package name.lsg.grammar.tree.join;

import name.lsg.grammar.tree.AST;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

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
    public void ident(Context context){

        IdentHelper.ident(context, "on");
        IdentHelper.ident(context, expr);
    }

}
