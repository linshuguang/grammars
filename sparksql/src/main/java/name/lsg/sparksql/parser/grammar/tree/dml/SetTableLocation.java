package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class SetTableLocation extends AST {
    AST tableIdentifier;
    AST partitionSpec;
    AST locationSpec;

    public SetTableLocation(AST tableIdentifier, AST partitionSpec, AST locationSpec){
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
        this.locationSpec = locationSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER", "TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
        IndentHelper.indentKeyWord(context, "SET");
        IndentHelper.indent(context, locationSpec);
    }
}
