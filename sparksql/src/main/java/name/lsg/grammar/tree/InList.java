package name.lsg.grammar.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class InList extends Predicate {
    List<AST> exprList = new ArrayList<>();

    public InList(boolean not){

    }

    public void addExpr(AST value){
        this.exprList.add(value);
    }
}