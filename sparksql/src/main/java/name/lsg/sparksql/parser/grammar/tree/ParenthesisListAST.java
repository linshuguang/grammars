package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class ParenthesisListAST extends ListHolderAST {

    public ParenthesisListAST(List<AST> asts){
        super(asts);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "(");
        super.indent(context);
        IndentHelper.indent(context, ")");
    }
}
