package name.lsg.sparksql.parser.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class NOT extends AST {
    AST value;

    public NOT(AST value){
        this.value = value;
    }
}

