package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class DescribeFuncName extends AST {
    String name;
    public DescribeFuncName(String name){
        this.name = name;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, name);
    }
}
