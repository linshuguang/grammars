package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/4.
 */
public class OVER extends AST {
    AST windowSpec;

    public OVER(AST windowSpec){
        this.windowSpec = windowSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "OVER");
        IndentHelper.indent(context, windowSpec);
    }

}
