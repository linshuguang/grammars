package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/4.
 */
public class CurrentRowFrameBound extends FrameBound {

    public CurrentRowFrameBound(String boundType){
        super(boundType);
    }

    @Override
    public void indent(Context context){
        super.indent(context);
        IndentHelper.indentKeyWord(context,"ROW");
    }
}
