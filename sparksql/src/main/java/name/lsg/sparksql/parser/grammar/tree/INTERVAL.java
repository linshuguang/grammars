package name.lsg.sparksql.parser.grammar.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class INTERVAL extends AST {
    List<AST> intervalFields = new ArrayList<>();

    public void addIntervalField(AST value){
        this.intervalFields.add(value);
    }
}