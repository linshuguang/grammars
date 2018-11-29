package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class RenameTable extends AST {
    String alter;
    AST from;
    AST to;

    public RenameTable(String alter, AST from, AST to){
        this.alter = alter;
        this.from = from;
        this.to = to;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER");
        IndentHelper.indent(context, alter);
        IndentHelper.indent(context, from);
        IndentHelper.indentKeyWord(context, "RENAME", "TO");
        IndentHelper.indent(context, to);
    }

}
