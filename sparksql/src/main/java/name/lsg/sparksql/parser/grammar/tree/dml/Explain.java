package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class Explain extends AST {
    String option;
    AST statement;

    public Explain(String option, AST statement){
        this.option = option;
        this.statement = statement;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"EXPLAIN");
        IndentHelper.indent(context,option);
        IndentHelper.indent(context,statement);
    }
}
