package name.lsg.sparksql.parser.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class InQuery extends Predicate {
    AST query;

    public InQuery(boolean not, AST query){
        this.query = query;
    }
}
