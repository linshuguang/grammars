package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class ManageResource extends AST {
    String op;
    AST identifier;
    String wildcard;

    public ManageResource(String op, AST identifier, String wildcard){
        this.op = op;
        this.identifier = identifier;
        this.wildcard = wildcard;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, op);
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, wildcard);
    }
}

