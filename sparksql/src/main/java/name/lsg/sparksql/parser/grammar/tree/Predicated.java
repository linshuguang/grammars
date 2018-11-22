package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Predicated extends AST {
    AST valueExpression;
    AST predicate;

    public Predicated(AST valueExpression){
        this.valueExpression = valueExpression;
    }

    @Override
    public void confess(Context context){
        runConfess(context, valueExpression);
        runConfess(context, predicate);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, valueExpression);
        IdentHelper.ident(context, predicate);
    }
}
