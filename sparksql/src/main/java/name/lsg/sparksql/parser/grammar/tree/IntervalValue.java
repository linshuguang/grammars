package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class IntervalValue extends AST {
    String sign=null;
    String value=null;

    @Override
    public void indent(Context context){
        if(sign!=null){
            IndentHelper.indentKeyWord(context, sign);
        }
        IndentHelper.indent(context, value);
    }

}
