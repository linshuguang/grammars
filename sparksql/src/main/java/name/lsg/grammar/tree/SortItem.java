package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class SortItem extends AST {
    AST expr;
    String ordering;
    String nulls;

    public SortItem(AST expr){
        this.expr = expr;
    }

    @Override
    public void confess(Context context){
        runConfess(context, expr);
        runConfess(context, ordering);
        runConfess(context, nulls);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, expr);
        IdentHelper.ident(context, ordering);
        IdentHelper.ident(context, nulls);
    }

}
