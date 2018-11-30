package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class Table extends AST {
    AST tableIdentifier;

    public Table(AST tableIdentifier){
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "TABLE");
        IndentHelper.indent(context, tableIdentifier);
    }
}
