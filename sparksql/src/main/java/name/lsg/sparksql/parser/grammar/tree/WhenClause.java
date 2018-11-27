package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/21.
 */
public class WhenClause extends AST {
    AST condition;
    AST result;

    public WhenClause(AST condition, AST result){
        this.condition = condition;
        this.result = result;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("when"));
        IndentHelper.indent(context, condition);
        IndentHelper.indent(context, IndentHelper.keyword("then"));
        IndentHelper.indent(context, result);
    }
}
