package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.relation.RelationPrimary;
import name.lsg.sparksql.parser.util.IdentHelper;

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
