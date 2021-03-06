package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class TruncateTable extends AST {

    AST tableIdentifier;
    AST partitionSpec;
    public TruncateTable(AST tableIdentifier, AST partitionSpec){
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "TRUNCATE","TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
    }
}

