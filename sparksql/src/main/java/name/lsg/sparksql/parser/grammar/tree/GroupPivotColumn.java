package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/12/3.
 */
public class GroupPivotColumn extends AST {
    List<AST> identifierList = new ArrayList<>();

    public void addColumn(AST identifier){
        identifierList.add(identifier);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, identifierList);
        IndentHelper.indent(context,")");
    }

}
