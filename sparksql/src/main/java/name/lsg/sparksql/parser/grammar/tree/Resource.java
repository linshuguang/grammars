package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class Resource extends AST {
    AST identifier;
    String str;

    public Resource(AST identifier, String str){
        this.identifier = identifier;
        this.str = str;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, str);
    }
}
