package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class CreateFileFormat extends AST {
    String action;
    AST format;

    public CreateFileFormat(String action, AST format){
        this.action = action;
        this.format = format;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,IndentHelper.keyword("STORED"));
        IndentHelper.indent(context,IndentHelper.keyword(action));
        IndentHelper.indent(context,format);
    }

}
