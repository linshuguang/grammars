package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class AddTableColumns extends AST {
    AST tableIdentifier;
    List<AST> columns;


    public AddTableColumns(AST tableIdentifier, List<AST> columns){
        this.tableIdentifier = tableIdentifier;
        this.columns = columns;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"ALTER", "TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indentKeyWord(context,"ADD", "COLUMNS");
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, columns);
        IndentHelper.indent(context, ")");
    }

}
