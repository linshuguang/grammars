package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class NOT extends AST {
    AST value;

    public NOT(AST value){
        this.value = value;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("not"));
        IndentHelper.indent(context, value);
    }
}

