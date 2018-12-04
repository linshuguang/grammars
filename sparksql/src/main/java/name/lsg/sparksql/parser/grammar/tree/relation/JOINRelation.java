package name.lsg.sparksql.parser.grammar.tree.relation;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

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
    public void indent(Context context){
        IndentHelper.indent(context, joinType);
        IndentHelper.indentKeyWord(context, "join");
        IndentHelper.indent(context, relationPrimary);
        IndentHelper.indent(context, joinCriteria);
    }

}
