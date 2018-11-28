package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class InsertIntoTable extends AST {
    boolean table;
    AST tableIdentifier;
    AST partitionSpec;

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "INSERT", "INTO");
        if(table) {
            IndentHelper.indentKeyWord(context, "table");
        }
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
    }

}
