package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class IntervalField extends AST {
    AST intervalValue;
    AST unit;
    AST to;

    public IntervalField(AST intervalValue, AST unit){
        this.intervalValue = intervalValue;
        this.unit = unit;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, intervalValue);
        IndentHelper.indent(context, unit);
        if(to!=null) {
            IndentHelper.indentKeyWord(context,"TO");
            IndentHelper.indent(context, to);
        }
    }

}
