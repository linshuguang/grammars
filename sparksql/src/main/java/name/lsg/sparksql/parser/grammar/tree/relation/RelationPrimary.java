package name.lsg.sparksql.parser.grammar.tree.relation;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class RelationPrimary extends AST {
    AST sample;

    public RelationPrimary(){}

    public RelationPrimary(AST sample){
        this.sample = sample;
    }
    @Override
    public void confess(Context context){
        runConfess(context, sample);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, sample);
    }
}
