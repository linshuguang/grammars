package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class ListAST extends AST {
    List<AST> astList = new ArrayList<>();

    public void addAST(AST ast){
        astList.add(ast);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, ")");
    }

}
