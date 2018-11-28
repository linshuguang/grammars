package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class POSITION extends AST {
    AST substr;
    AST str;

    public POSITION(AST substr, AST str){
        this.substr = substr;
        this.str = str;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,IndentHelper.keyword("position"));
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, substr);
        IndentHelper.indent(context, IndentHelper.keyword("in"));
        IndentHelper.indent(context, str);
        IndentHelper.indent(context,")");
    }

}
