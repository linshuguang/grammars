package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class SetTableProperties extends AST {
    String alter;
    AST tableIdentifier;
    AST tablePropertyList;

    public SetTableProperties(String alter, AST tableIdentifier, AST tablePropertyList){
        this.alter = alter;
        this.tableIdentifier = tableIdentifier;
        this.tablePropertyList = tablePropertyList;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER");
        IndentHelper.indent(context, alter);
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indentKeyWord(context, "SET", "TBLPROPERTIES");
        IndentHelper.indent(context, tablePropertyList);
    }
}
