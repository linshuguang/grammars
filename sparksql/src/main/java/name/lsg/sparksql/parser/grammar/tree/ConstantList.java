package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class ConstantList extends AST {
    List<AST> constants = new ArrayList<>();

    public void addConstant(AST constant){
        this.constants.add(constant);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, constants);
        IndentHelper.indent(context,")");
    }

}
