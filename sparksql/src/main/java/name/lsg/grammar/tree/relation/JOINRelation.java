package name.lsg.grammar.tree.relation;

import lombok.Data;
import name.lsg.grammar.tree.AST;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class JOINRelation extends NaturalJOINRelation{

    AST joinCriteria;

    public JOINRelation(AST relationType, AST relationPrimary){
        super(relationType, relationPrimary);
    }

    @Override
    public void confess(Context context){
        runConfess(context, joinType);
        runConfess(context, "join");
        runConfess(context, relationPrimary);
        runConfess(context, joinCriteria);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, joinType);
        IdentHelper.ident(context, IdentHelper.keyword("join"));
        IdentHelper.ident(context, relationPrimary);
        IdentHelper.ident(context, joinCriteria);
    }

}
