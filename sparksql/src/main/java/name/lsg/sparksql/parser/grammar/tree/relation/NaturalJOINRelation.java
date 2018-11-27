package name.lsg.sparksql.parser.grammar.tree.relation;

import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class NaturalJOINRelation extends Relation {

    AST joinType;
    AST relationPrimary;

    public NaturalJOINRelation(AST joinType, AST relationPrimary){
        this.relationPrimary = relationPrimary;
        this.joinType = joinType;
    }

    @Override
    public void confess(Context context){
        runConfess(context,"NATURAL");
        runConfess(context, joinType);
        runConfess(context, "join");
        runConfess(context, relationPrimary);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("NATURAL"));
        IndentHelper.indent(context, joinType);
        IndentHelper.indent(context, IndentHelper.keyword("join"));
        IndentHelper.indent(context, relationPrimary);
    }

}
