package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/21.
 */
public class CAST extends AST {
    AST expr;
    AST dataType;

    public CAST(AST expr, AST dataType){
        this.expr = expr;
        this.dataType = dataType;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("cast"));
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,expr);
        IndentHelper.indent(context, IndentHelper.keyword("as"));
        IndentHelper.indent(context,dataType);
        IndentHelper.indent(context,")");
    }

}
