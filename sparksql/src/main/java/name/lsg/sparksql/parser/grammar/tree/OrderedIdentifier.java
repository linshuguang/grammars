package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class OrderedIdentifier extends AST {
    AST identifier;
    String ordering;

    public OrderedIdentifier(AST identifier, String ordering){
        this.identifier = identifier;
        this.ordering = ordering;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, ordering);
    }
}
