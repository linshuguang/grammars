package name.lsg.sparksql.parser.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class IntegerValue extends NumberValue {

    public IntegerValue(boolean minus, String text){
        super(minus, text);
    }

    public IntegerValue(String text){
        super(true, text);
    }


}

