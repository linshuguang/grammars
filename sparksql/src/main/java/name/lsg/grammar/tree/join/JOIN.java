package name.lsg.grammar.tree.join;

import name.lsg.grammar.tree.AST;
import name.lsg.grammar.tree.relation.Relation;

/**
 * Created by kenya on 2018/11/13.
 */
public class JOIN extends Relation {
    AST left;
    String operator;
    AST right;
    AST qualifier;

    public JOIN(){

    }

    public JOIN(AST left, String operator, AST right, AST qualifier){
        this.left = left;
        this.operator = operator;
        this.right = right;
        this.qualifier = qualifier;
    }
}
