package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class Sample extends AST {
    AST method;


    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "TABLESAMPLE");
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, method);
        IndentHelper.indent(context, ")");
    }

}
