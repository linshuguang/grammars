package name.lsg.grammar.tree.join;

import lombok.Data;
import name.lsg.grammar.tree.AST;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class JOINType extends AST {
    boolean outer = false;
    boolean left = false;

    public void markAsOuter(){
        this.outer = true;
    }

    public void markAsLeft(){
        this.left = true;
    }
}
