package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class DISTINCT extends AST {
    @Override
    public void indent(Context context) {
        IndentHelper.indent(context, IndentHelper.keyword("distinct"));
    }
}
