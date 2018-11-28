package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class Windows extends AST {
    List<AST> windows = new ArrayList<>();

    public void addWindow(AST window){
        windows.add(window);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,IndentHelper.keyword("WINDOW"));
        IndentHelper.indent(context, windows);
    }

}
