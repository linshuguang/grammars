package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class RepairTable extends AST {
    AST tableIdentifier;

    public RepairTable(AST tableIdentifier){
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"MSCK", "REPAIR", "TABLE");
        IndentHelper.indent(context,tableIdentifier);
    }
}
