package name.lsg.grammar.tree;

import name.lsg.grammar.tree.relation.RelationPrimary;

/**
 * Created by kenya on 2018/11/13.
 */

public class AliasedRelation extends RelationPrimary {
    AST relation;
    AST tableAlias;

    public AliasedRelation(AST relation, AST sample, AST tableAlias){
        this.relation = relation;
        this.tableAlias  = tableAlias;
    }
}

