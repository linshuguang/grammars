package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class TablePropertyList extends AST {
    List<AST> propertyList = new ArrayList<>();

    public void addProperty(AST property){
        propertyList.add(property);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,propertyList);
        IndentHelper.indent(context,")");
    }
}
