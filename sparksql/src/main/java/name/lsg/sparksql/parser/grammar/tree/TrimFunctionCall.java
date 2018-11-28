package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class TrimFunctionCall extends FunctionCall {
    AST qualifiedName;
    String trimOption;
    List<AST> arguments = new ArrayList<>();


    public TrimFunctionCall(AST qualifiedName, String trimOption){
        this.qualifiedName = qualifiedName;
        this.trimOption = trimOption;
    }

    public void addArgument(AST argument){
        this.arguments.add(argument);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,qualifiedName);
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,trimOption);

        IndentHelper.indent(context,arguments.get(0));
        IndentHelper.indent(context,IndentHelper.keyword("from"));
        IndentHelper.indent(context,arguments.get(1));
        IndentHelper.indent(context,")");
    }



}

