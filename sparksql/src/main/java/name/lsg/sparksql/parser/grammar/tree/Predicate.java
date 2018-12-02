package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Predicate extends AST {
    boolean not=false;
    public Predicate (){}
    public Predicate (boolean not) { this.not = not;}
}
