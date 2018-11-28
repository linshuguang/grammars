package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class RowConstructor extends AST {
    List<AST> rows = new ArrayList<>();

    public RowConstructor(AST row){
        rows.add(row);
    }

    public void addRow(AST row){
        rows.add(row);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, rows);
        IndentHelper.indent(context, ")");
    }

}
