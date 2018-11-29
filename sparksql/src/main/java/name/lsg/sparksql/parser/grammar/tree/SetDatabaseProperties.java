package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class SetDatabaseProperties extends AST {
    AST identifier;
    AST tablePropertyList;

    public SetDatabaseProperties(AST identifier, AST tablePropertyList){
        this.identifier = identifier;
        this.tablePropertyList = tablePropertyList;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER", "DATABASE");
        IndentHelper.indent(context, identifier);
        IndentHelper.indentKeyWord(context, "SET", "DBPROPERTIES");
        IndentHelper.indent(context, tablePropertyList);
    }


}
