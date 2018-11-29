package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class SetTableSerDe extends AST {
    AST tableIdentifier;
    AST partitionSpec;
    String serde;
    AST tablePropertyList;
    boolean simple = false;

    public SetTableSerDe(AST tableIdentifier, AST partitionSpec, String serde, AST tablePropertyList) {
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
        this.serde = serde;
        this.tablePropertyList = tablePropertyList;
    }

    public SetTableSerDe(AST tableIdentifier, AST partitionSpec, AST tablePropertyList) {
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
        this.tablePropertyList = tablePropertyList;
        this.simple = true;
    }

    @Override
    public void indent(Context context) {
        IndentHelper.indentKeyWord(context, "ALTER", "TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
        IndentHelper.indent(context, partitionSpec);

        if(!simple) {
            IndentHelper.indentKeyWord(context, "SET", "SERD");
            IndentHelper.indent(context, serde);
            if (tablePropertyList != null) {
                IndentHelper.indentKeyWord(context, "WITH", "SERDEPROPERTIES");
                IndentHelper.indent(context, tablePropertyList);
            }
        }else{
            IndentHelper.indentKeyWord(context, "SET", "SERDEPROPERTIES");
            IndentHelper.indent(context, tablePropertyList);
        }


    }
}
