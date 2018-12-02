package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;

/**
 * Created by kenya on 2018/11/13.
 */
public class IntegerValue extends NumberValue {

    public IntegerValue(boolean minus, String text){
        super(minus, text);
    }

    public IntegerValue(String text){
        super(false, text);
    }

    @Override
    public void indent(Context context){
        super.indent(context);
    }

}

