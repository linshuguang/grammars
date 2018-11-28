package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/27.
 */
@Data
public class FIRST extends AST {
    AST expr;
    boolean ignore = false;

    public FIRST(AST expr){
        this.expr = expr;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,IndentHelper.keyword("first"));
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, expr);
        if(ignore) {
            IndentHelper.indent(context, IndentHelper.keyword("IGNORE"));
            IndentHelper.indent(context, IndentHelper.keyword("nulls"));
        }
        IndentHelper.indent(context,")");
    }

}
