package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class RenameTablePartition extends AST {
    AST tableIdentifier;
    AST from;
    AST to;

    public RenameTablePartition(AST tableIdentifier, AST from, AST to){
        this.tableIdentifier = tableIdentifier;
        this.from = from;
        this.to = to;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER","TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, from);
        IndentHelper.indentKeyWord(context, "RENAME","TO");
        IndentHelper.indent(context, to);

    }

}
