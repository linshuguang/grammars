package name.lsg.grammar.tree.relation;

import name.lsg.grammar.tree.AST;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class Relation extends AST {
    AST relationPrimary;
    List<AST> joinRelationList = new ArrayList<>();

    public Relation(AST relationPrimary){
        this.relationPrimary = relationPrimary;
    }

    public void addRelation(AST value){
        this.joinRelationList.add(value);
    }

    public Relation(){}

    @Override
    public void confess(Context context){
        runConfess(context, relationPrimary);
        runConfess(context, joinRelationList);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, relationPrimary);
        IdentHelper.ident(context, joinRelationList);
    }
}
