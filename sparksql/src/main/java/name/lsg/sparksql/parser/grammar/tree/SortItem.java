package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

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
    public void indent(Context context){
        IndentHelper.indent(context, expr);
        IndentHelper.indent(context, ordering);
        if(nulls!=null) {
            IndentHelper.indent(context,"NULLS");
            IndentHelper.indent(context, nulls);
        }
    }

}
