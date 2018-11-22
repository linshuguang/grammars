package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class ArithmeticUnary extends AST {
    String operator;
    AST value;

    public ArithmeticUnary(String operator, AST value){
        this.operator = operator;
        this.value = value;
    }

    @Override
    public void confess(Context context){
        runConfess(context, operator);
        runConfess(context, value);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, operator);
        IdentHelper.ident(context, value);
    }

}
