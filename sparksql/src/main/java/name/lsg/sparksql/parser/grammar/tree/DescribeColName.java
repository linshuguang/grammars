package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class DescribeColName extends AST {
    List<AST> nameParts = new ArrayList<>();

    public void addName(AST name){
        nameParts.add(name);
    }

    @Override
    public void indent(Context context){

        IndentHelper.indent(context,concat(nameParts,'.'));
    }
}
