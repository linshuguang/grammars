package name.lsg.sparksql.parser.grammar.tree.join;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.tree.relation.Relation;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class JOIN extends Relation {
    AST left;
    String operator;
    AST right;
    AST qualifier;

    public JOIN(){

    }

    public JOIN(AST left, String operator, AST right){
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"join");

    }
}
