package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class SingleInsertQuery extends AST {
    AST insertInto;
    AST queryTerm ;
    AST queryOrganization;

    public SingleInsertQuery(AST queryTerm, AST queryOrganization){
        this.queryTerm = queryTerm;
        this.queryOrganization = queryOrganization;
    }


    @Override
    public void confess(Context context){
        runConfess(context, insertInto);
        runConfess(context, queryTerm);
        runConfess(context, queryOrganization);


    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, insertInto);
        IdentHelper.ident(context, queryTerm);
        IdentHelper.ident(context, queryOrganization);


    }

}