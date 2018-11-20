package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

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
    public void ident(Context context){
        IdentHelper.ident(context,left);
        IdentHelper.ident(context,IdentHelper.keyword("and"));
        IdentHelper.ident(context, right);
    }
}
