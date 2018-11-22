package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class GroupBy extends AST {
    List<AST> groupingExpressions = new ArrayList<>();

    public void addGroupingExpression(AST value){
        this.groupingExpressions.add(value);
    }

    @Override
    public void confess(Context context){
        runConfess(context, "group by");
        runConfess(context, groupingExpressions);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("group"));
        IdentHelper.ident(context, IdentHelper.keyword("by"));
        IdentHelper.ident(context, groupingExpressions);
    }

}
