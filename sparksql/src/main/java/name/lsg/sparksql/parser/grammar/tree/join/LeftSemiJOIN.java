package name.lsg.sparksql.parser.grammar.tree.join;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class LeftSemiJOIN extends JOINType {

    @Override
    public void confess(Context context){
        runConfess(context, "left semi");
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("left"));
        IndentHelper.indent(context, IndentHelper.keyword("semi"));
    }


}
