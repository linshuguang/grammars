package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/21.
 */
public class CAST extends AST {
    AST expr;
    AST dataType;

    public CAST(AST expr, AST dataType){
        this.expr = expr;
        this.dataType = dataType;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("cast"));
        IdentHelper.ident(context,"(");
        IdentHelper.ident(context,expr);
        IdentHelper.ident(context, IdentHelper.keyword("as"));
        IdentHelper.ident(context,dataType);
        IdentHelper.ident(context,")");
    }

}
