package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.tree.relation.RelationPrimary;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class TableName extends RelationPrimary {
    AST tableIdentifier;
    AST tableAlias;

    public TableName( AST tableIdentifier,AST sample, AST tableAlias){
        this.tableIdentifier = tableIdentifier;
        this.tableAlias = tableAlias;
    }

    @Override
    public void confess(Context context){
        runConfess(context, tableIdentifier);
        runConfess(context, tableAlias);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, tableAlias);
    }

}