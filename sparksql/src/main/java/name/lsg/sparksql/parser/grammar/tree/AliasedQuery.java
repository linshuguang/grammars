package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.relation.RelationPrimary;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class AliasedQuery extends RelationPrimary {
    AST queryNoWith;
    AST tableAlias;

    public AliasedQuery(AST queryNoWith, AST sample, AST tableAlias){
        super(sample);
        this.queryNoWith = queryNoWith;
        this.tableAlias  = tableAlias;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, queryNoWith);
        IndentHelper.indent(context,")");
        super.indent(context);
        IndentHelper.indent(context, tableAlias);
    }

}
