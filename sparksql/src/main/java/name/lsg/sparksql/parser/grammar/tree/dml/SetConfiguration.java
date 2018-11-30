package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class SetConfiguration extends AST {
    String wildcard;

    public SetConfiguration(String wildcard){
        this.wildcard = wildcard;
    }

    @Override
    public void indent(Context context){

        IndentHelper.indentKeyWord(context, "SET");
        IndentHelper.indent(context, wildcard);
    }
}
