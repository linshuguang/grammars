package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class QueryPrimary extends AST {
    AST querySpecification;

    public QueryPrimary(AST querySpecification){
        this.querySpecification = querySpecification;
    }

    @Override
    public void confess(Context context){
        runConfess(context, querySpecification);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, querySpecification);
    }

}

