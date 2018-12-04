package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/3.
 */
@Data
public class PivotValue extends AST {
    AST value;
    AST alias;
    boolean as =false;


    public PivotValue(AST value){
        this.value = value;
    }

    public void markAS(){
        as = true;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, value);
        if(alias!=null) {
            if(as) {
                IndentHelper.indentKeyWord(context, "as");
            }
            IndentHelper.indent(context, alias);
        }
    }

}
