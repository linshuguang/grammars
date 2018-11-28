package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/21.
 */
public class STRUCT extends ComplexDataType {
    List<AST> arguments = new ArrayList<>();

    public STRUCT(AST argument){
        this.addArgument(argument);
    }

    public void addArgument(AST argument){
        arguments.add(argument);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,IndentHelper.keyword("struct"));

        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, arguments);
        IndentHelper.indent(context,")");
    }

}
