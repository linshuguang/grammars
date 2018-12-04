package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class FunctionCall extends AST {
    AST qualifiedName;
    List<AST> arguments = new ArrayList<>();
    AST setQuantifier;
    AST over;

    public FunctionCall(){

    }

    public FunctionCall(AST qualifiedName){
        this.qualifiedName = qualifiedName;
    }

    public void addArgument(AST argument){
        this.arguments.add(argument);
    }

    @Override
    public void confess(Context context){
        runConfess(context,qualifiedName);
        runConfess(context,"(");
        runConfess(context, arguments);
        runConfess(context,")");
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,qualifiedName);
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, arguments);
        IndentHelper.indent(context,")");
        IndentHelper.indent(context, over);
    }

    @Override
    public AST eval(Context context){
        return null;
    }

}