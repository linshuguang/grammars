package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/22.
 */
public class ParenthesizedExpression extends AST {
    AST ast;
    public ParenthesizedExpression(AST ast){
        this.ast = ast;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, "(");
        IdentHelper.ident(context, ast);
        IdentHelper.ident(context, ")");
    }
}
