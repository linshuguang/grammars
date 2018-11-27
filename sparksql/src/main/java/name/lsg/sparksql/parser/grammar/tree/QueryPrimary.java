package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

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
    public void indent(Context context){
        IndentHelper.indent(context, querySpecification);
    }

}

