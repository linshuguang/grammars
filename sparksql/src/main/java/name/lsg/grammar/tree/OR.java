package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class OR extends AST {
    AST left;
    AST right;

    public OR(AST left, AST right){
        this.left = left;
        this.right = right;
    }

    @Override
    public void confess(Context context){
        runConfess(context,left);
        runConfess(context,"or");
        runConfess(context, right);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,left);
        IdentHelper.ident(context,"or");
        IdentHelper.ident(context, right);
    }

}