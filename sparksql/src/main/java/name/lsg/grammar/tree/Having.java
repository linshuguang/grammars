package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class Having extends AST {
    AST booleanExpression;

    public Having(AST booleanExpression){
        this.booleanExpression = booleanExpression;
    }

    @Override
    public void confess(Context context){
        runConfess(context,"having");
        runConfess(context,booleanExpression);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,"having");
        IdentHelper.ident(context,booleanExpression);
    }


}