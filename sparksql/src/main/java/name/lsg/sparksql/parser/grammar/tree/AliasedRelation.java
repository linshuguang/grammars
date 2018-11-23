package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.relation.RelationPrimary;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */

public class AliasedRelation extends RelationPrimary {
    AST relation;
    AST tableAlias;

    public AliasedRelation(AST relation, AST sample, AST tableAlias){
        super(sample);
        this.relation = relation;
        this.tableAlias  = tableAlias;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,"(");
        IdentHelper.ident(context, relation);
        IdentHelper.ident(context,")");
        super.ident(context);
        IdentHelper.ident(context, tableAlias);
    }



}

