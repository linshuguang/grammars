package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class IdentifierList extends AST {
    List<AST> identifierSeq;

    public IdentifierList( List<AST> identifierSeq){
        this.identifierSeq = identifierSeq;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, identifierSeq);
        IndentHelper.indent(context, ")");
    }

}
