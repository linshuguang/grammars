package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/21.
 */
@Data
public class Argument extends AST {
    AST qualifier;
    AST expr;

    public Argument(AST qualifier, AST expr){
        this.qualifier = qualifier;
        this.expr = expr;
    }

    public Argument(AST expr){
        this.qualifier = null;
        this.expr = expr;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,qualifier);
        IndentHelper.indent(context, expr);
    }
}
