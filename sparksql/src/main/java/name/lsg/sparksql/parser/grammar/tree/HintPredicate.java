package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class HintPredicate extends AST {
    boolean not =false;

    public HintPredicate(boolean not){ this.not = not; }

    @Override
    public void indent(Context context){
        if(not){
            IndentHelper.indentKeyWord(context, "not");
        }
    }
}
