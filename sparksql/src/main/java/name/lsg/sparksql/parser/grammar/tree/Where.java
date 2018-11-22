package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Where extends AST {
    AST booleanExpression;

    public Where(AST booleanExpression){
        this.booleanExpression = booleanExpression;
    }

    @Override
    public void confess(Context context){
        runConfess(context,"where");
        runConfess(context, booleanExpression);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,IdentHelper.keyword("where"));
        IdentHelper.ident(context, booleanExpression);
    }

}
