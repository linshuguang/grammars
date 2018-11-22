package name.lsg.sparksql.parser.grammar.tree;

/**
 * Created by kenya on 2018/11/13.
 */
public class BoolValue extends AST {
    boolean bool ;

    public BoolValue(boolean bool){
        this.bool = bool;
    }

    @Override
    public boolean toBoolean(){
        return bool;
    }
}
