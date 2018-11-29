package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class RecoverPartitions extends AST {
    AST tableIdentifier;

    public RecoverPartitions(AST tableIdentifier){
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER","TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indentKeyWord(context, "RECOVER","PARTITIONS");
    }

}

