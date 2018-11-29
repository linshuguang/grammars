package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class HintPredicated extends AST {
    AST hintValueExpression;
    AST hintPredicate;

    public HintPredicated(AST hintValueExpression, AST hintPredicate){
        this.hintValueExpression = hintValueExpression;
        this.hintPredicate = hintPredicate;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, hintValueExpression);
        IndentHelper.indent(context, hintPredicate);
    }

}
