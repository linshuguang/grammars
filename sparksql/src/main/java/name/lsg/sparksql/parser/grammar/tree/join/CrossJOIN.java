package name.lsg.sparksql.parser.grammar.tree.join;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class CrossJOIN extends JOINType {
    @Override
    public void confess(Context context){
        runConfess(context, "cross");
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "cross");
    }
}
