package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class InsertOverwriteTable extends AST {
    AST tableIdentifier;
    AST partitionSpec;
    boolean notExists = false;

    public InsertOverwriteTable(AST tableIdentifier){
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "INSERT", "OVERWRITE" ,"TABLE ");
        IndentHelper.indent(context, tableIdentifier);
        if(partitionSpec!=null){
            IndentHelper.indent(context, partitionSpec);
            if(notExists){
                IndentHelper.indentKeyWord(context, "IF", "NOT" ,"EXISTS ");
            }
        }
    }
}
