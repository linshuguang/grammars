package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.grammar.tree.relation.RelationPrimary;
import name.lsg.util.IdentHelper;
import org.springframework.jca.cci.CciOperationNotSupportedException;

/**
 * Created by kenya on 2018/11/13.
 */
public class AliasedQuery extends RelationPrimary {
    AST queryNoWith;
    AST tableAlias;

    public AliasedQuery(AST queryNoWith, AST sample, AST tableAlias){
        this.queryNoWith = queryNoWith;
        this.tableAlias  = tableAlias;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,"(");
        IdentHelper.ident(context, queryNoWith);
        IdentHelper.ident(context,")");
        IdentHelper.ident(context, tableAlias);
    }

}
