package name.lsg.sparksql.parser.grammar.tree.ddl;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/2.
 */
public class FailNativeCommand extends AST {
    AST unsupportedHiveNativeCommands;
    String other;

    public FailNativeCommand(AST unsupportedHiveNativeCommands, String other){
        this.unsupportedHiveNativeCommands = unsupportedHiveNativeCommands;
        this.other = other;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, unsupportedHiveNativeCommands);
        IndentHelper.indent(context, other);
    }
}
