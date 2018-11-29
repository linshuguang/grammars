package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class DropView extends AST {
    boolean exists =false;
    AST tableIdentifier;

    public DropView(boolean exists, AST tableIdentifier){
        this.exists = exists;
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "DROP","VIEW");
        if(exists) {
            IndentHelper.indentKeyWord(context, "IF", "EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
    }
}
