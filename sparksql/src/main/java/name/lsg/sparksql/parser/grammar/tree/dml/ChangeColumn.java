package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ChangeColumn extends AST {
    AST tableIdentifier;
    AST partitionSpec;
    boolean column=false;
    AST identifier;
    AST colType;
    AST colPosition;

    public ChangeColumn(AST tableIdentifier,AST partitionSpec,boolean column,AST identifier,AST colType,AST colPosition){
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
        this.column = column;
        this.identifier = identifier;
        this.colType = colType;
        this.colPosition = colPosition;
    }
    /*
    ALTER TABLE tableIdentifier partitionSpec?
    CHANGE COLUMN? identifier colType colPosition?
    */

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER", "TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
        IndentHelper.indentKeyWord(context, "CHANGE");
        if(column){
            IndentHelper.indentKeyWord(context, "column");
        }
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, colType);
        IndentHelper.indent(context, colPosition);
    }

}
