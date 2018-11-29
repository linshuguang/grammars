package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class HintPredicateIN extends HintPredicate {
    List<AST> exprList = new ArrayList<>();

    public HintPredicateIN(boolean not){
        super(not);
    }

    public void addExpr(AST expr){
        exprList.add(expr);
    }

    @Override
    public void indent(Context context){
        super.indent(context);
        IndentHelper.indentKeyWord(context,"IN");
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,exprList);
        IndentHelper.indent(context,")");

    }

}
