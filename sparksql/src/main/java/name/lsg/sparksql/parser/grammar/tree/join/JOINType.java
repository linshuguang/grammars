package name.lsg.sparksql.parser.grammar.tree.join;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.tree.DefaultIndentAST;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class JOINType extends DefaultIndentAST{
    boolean outer = false;
    boolean left = false;

    public void markAsOuter(){
        this.outer = true;
    }

    public void markAsLeft(){
        this.left = true;
    }

}
