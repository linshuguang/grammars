package name.lsg.grammar.tree;

import name.lsg.grammar.tree.relation.RelationPrimary;

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

}
