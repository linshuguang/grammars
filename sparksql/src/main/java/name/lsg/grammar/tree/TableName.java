package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.tree.relation.RelationPrimary;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

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
    public void ident(Context context){
        IdentHelper.ident(context, tableIdentifier);
        IdentHelper.ident(context, tableAlias);
    }

}