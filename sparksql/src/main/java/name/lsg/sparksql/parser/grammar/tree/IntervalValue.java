package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class IntervalValue extends AST {
    String sign=null;
    String value=null;

}
