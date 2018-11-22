package name.lsg.sparksql.parser.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class NamedQuery extends AST {
    AST identifier;
    AST query;

    public NamedQuery(AST identifier, AST query){
        this.identifier = identifier;
        this.query = query;
    }
}
