package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/21.
 */
public class WhenClause extends AST {
    AST condition;
    AST result;

    public WhenClause(AST condition, AST result){
        this.condition = condition;
        this.result = result;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("when"));
        IdentHelper.ident(context, condition);
        IdentHelper.ident(context, IdentHelper.keyword("then"));
        IdentHelper.ident(context, result);
    }
}