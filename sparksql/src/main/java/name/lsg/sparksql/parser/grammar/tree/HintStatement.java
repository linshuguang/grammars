package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class HintStatement extends Hint {
    AST hintName;
    List<AST> parameters = new ArrayList<>();

    public HintStatement(AST hintName){
        this.hintName = hintName;
    }

    public void addParam(AST param){
        parameters.add(param);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, hintName);
        if(parameters.size()>0) {
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, parameters);
            IndentHelper.indent(context, ")");
        }
    }
}
