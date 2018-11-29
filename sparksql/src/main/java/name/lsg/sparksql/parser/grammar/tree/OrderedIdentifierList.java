package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class OrderedIdentifierList extends AST {
    List<AST> identifiers = new ArrayList<>();

    public void addIdentifier(AST identifier){
        this.identifiers.add(identifier);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, identifiers);
        IndentHelper.indent(context,")");
    }
}
