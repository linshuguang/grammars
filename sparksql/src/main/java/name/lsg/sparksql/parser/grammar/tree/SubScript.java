package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class SubScript extends AST {
    AST pe;
    AST index;

    public SubScript(AST pe, AST index){
        this.pe = pe;
        this.index = index;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, pe);
        IndentHelper.indent(context, "[");
        IndentHelper.indent(context, index);
        IndentHelper.indent(context, "]");
    }

}
