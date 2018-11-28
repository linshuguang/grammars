package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class TypeConstructor extends AST {
    String type;
    AST identifier;

    public TypeConstructor(AST identifier, String type){
        this.identifier = identifier;
        this.type = type;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, type);
    }

}

