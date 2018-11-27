package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class Having extends AST {
    AST booleanExpression;

    public Having(AST booleanExpression){
        this.booleanExpression = booleanExpression;
    }

    @Override
    public void confess(Context context){
        runConfess(context,"having");
        runConfess(context,booleanExpression);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"having");
        IndentHelper.indent(context,booleanExpression);
    }


}