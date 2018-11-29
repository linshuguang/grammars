package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class UnsetTableProperties extends AST {
    String alter;
    AST tableIdentifier;
    boolean exists = false;
    AST tablePropertyList;

    public UnsetTableProperties(String alter, AST tableIdentifier, boolean exists, AST tablePropertyList){
        this.alter = alter;
        this.tableIdentifier = tableIdentifier;
        this.exists = exists;
        this.tablePropertyList = tablePropertyList;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER");
        IndentHelper.indent(context, alter);
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indentKeyWord(context, "UNSET", "TBLPROPERTIES");
        if(exists){
            IndentHelper.indentKeyWord(context, "IF", "EXISTS");
        }
        IndentHelper.indent(context, tablePropertyList);
    }

}
