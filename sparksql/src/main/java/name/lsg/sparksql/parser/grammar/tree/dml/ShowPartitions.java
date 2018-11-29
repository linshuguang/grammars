package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ShowPartitions extends AST {
    AST tableIdentifier;
    AST partitionSpec;

    public ShowPartitions(AST tableIdentifier, AST partitionSpec){
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "SHOW","PARTITIONS");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
    }
}
