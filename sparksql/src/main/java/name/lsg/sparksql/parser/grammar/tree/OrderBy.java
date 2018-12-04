package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/12/3.
 */
public class OrderBy extends AST {

    List<AST> sortItems = new ArrayList<>();

    public void addSortItem(AST item){
        this.sortItems.add(item);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"order","by");
        IndentHelper.indent(context, sortItems);
    }
}
