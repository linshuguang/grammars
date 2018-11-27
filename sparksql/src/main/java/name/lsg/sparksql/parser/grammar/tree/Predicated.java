package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

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
    public void indent(Context context){
        IndentHelper.indent(context, valueExpression);
        IndentHelper.indent(context, predicate);
    }
}
