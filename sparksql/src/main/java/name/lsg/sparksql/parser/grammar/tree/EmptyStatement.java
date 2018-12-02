package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/2.
 */
public class EmptyStatement extends AST {

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,";");
    }
}
