package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class ListHolderAST extends AST {
    List<AST> asts;

    public ListHolderAST(List<AST> asts){
        this.asts = asts;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, asts);
    }

}
