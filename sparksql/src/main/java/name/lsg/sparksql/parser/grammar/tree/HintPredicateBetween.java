package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class HintPredicateBetween extends HintPredicate {
    AST lower;
    AST right;

    public HintPredicateBetween(boolean not, AST lower, AST right){
        super(not);
        this.lower = lower;
        this.right = right;
    }

    @Override
    public void indent(Context context){
        super.indent(context);
        IndentHelper.indentKeyWord(context, "between");
        IndentHelper.indent(context, lower);
        IndentHelper.indentKeyWord(context, "and");
        IndentHelper.indent(context, right);
    }


}
