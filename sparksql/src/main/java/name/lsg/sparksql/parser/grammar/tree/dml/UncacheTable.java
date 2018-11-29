package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class UncacheTable extends AST {

    boolean exists;
    AST tableIdentifier;

    public UncacheTable(boolean exists, AST tableIdentifier){
        this.exists = exists;
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "UNCACHE", "TABLE");
        if(exists){
            IndentHelper.indentKeyWord(context, "IF", "EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
    }
}
