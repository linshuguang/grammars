package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class DropTable extends AST {
    boolean exists =false;
    AST tableIdentifier;
    boolean purge= false;

    public DropTable(boolean exists, AST tableIdentifier, boolean purge){
        this.exists = exists;
        this.tableIdentifier = tableIdentifier;
        this.purge = purge;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "DROP","TABLE");
        if(exists) {
            IndentHelper.indentKeyWord(context, "IF", "EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
        if(purge) {
            IndentHelper.indentKeyWord(context, "PURGE");
        }
    }
}
