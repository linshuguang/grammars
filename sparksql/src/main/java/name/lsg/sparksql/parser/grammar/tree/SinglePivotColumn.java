package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/3.
 */
public class SinglePivotColumn extends AST {
    AST identifier;

    public SinglePivotColumn(AST identifier){
        this.identifier = identifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
    }
}
