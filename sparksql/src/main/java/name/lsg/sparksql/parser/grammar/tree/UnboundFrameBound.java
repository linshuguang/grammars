package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.FrameBound;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/4.
 */
public class UnboundFrameBound extends FrameBound {

    public UnboundFrameBound(String boundType){
        super(boundType);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"UNBOUNDED");
        super.indent(context);
    }

}
