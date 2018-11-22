package name.lsg.sparksql.parser.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class IsDISTINCT extends Predicate {
    AST right;

    public IsDISTINCT(boolean not, AST right){
        this.right = right;
    }
}
