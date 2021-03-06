package name.lsg.sparksql.parser.grammar.tree.join;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class RightJOIN extends JOINType {

    @Override
    public void confess(Context context){
        runConfess(context, "right");
        if(isOuter()){
            runConfess(context, "outer");
        }
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("right"));
        if(isOuter()){
            IndentHelper.indent(context, IndentHelper.keyword("outer"));
        }
    }
}
