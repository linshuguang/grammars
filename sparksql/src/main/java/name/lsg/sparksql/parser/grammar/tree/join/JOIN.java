package name.lsg.sparksql.parser.grammar.tree.join;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.tree.relation.Relation;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class JOIN extends Relation {
    AST left;
    String operator;
    AST right;
    AST qualifier;

    public JOIN(){

    }

    public JOIN(AST left, String operator, AST right, AST qualifier){
        this.left = left;
        this.operator = operator;
        this.right = right;
        this.qualifier = qualifier;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("join"));
    }
}
