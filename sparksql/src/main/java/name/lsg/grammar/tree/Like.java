package name.lsg.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class Like extends Predicate {
    String like;
    AST pattern;
    public Like(boolean not, String like, AST pattern){
        this.like = like;
        this.pattern = pattern;
    }
}
