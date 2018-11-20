package name.lsg.grammar.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class Hint extends AST {
    List<AST> statements = new ArrayList<>();

    public void addStatement(AST value){
        this.statements.add(value);
    }
}

