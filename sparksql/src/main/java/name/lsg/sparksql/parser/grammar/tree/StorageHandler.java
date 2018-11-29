package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class StorageHandler extends AST {
    String handler;
    AST tablePropertyList;

    public StorageHandler(String handler, AST tablePropertyList){
        this.handler = handler;
        this.tablePropertyList = tablePropertyList;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, handler);
        if(tablePropertyList!=null){
            IndentHelper.indentKeyWord(context,"WITH", "SERDEPROPERTIES");
            IndentHelper.indent(context,tablePropertyList);
        }
    }

}
