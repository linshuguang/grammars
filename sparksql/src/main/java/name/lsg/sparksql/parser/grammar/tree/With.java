package name.lsg.sparksql.parser.grammar.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class With extends AST {
    List<AST> namedQueryList = new ArrayList<>();

    public void addNamedQuery( AST value){
        this.namedQueryList.add(value);
    }

}
