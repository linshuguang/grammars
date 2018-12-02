package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class InQuery extends Predicate {
    AST query;

    public InQuery(boolean not, AST query){
        super(not);
        this.query = query;
    }

    @Override
    public void indent(Context context){
        if(not){
            IndentHelper.indentKeyWord(context, "not");
        }
        IndentHelper.indentKeyWord(context,"IN");

        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,query);
        IndentHelper.indent(context,")");
    }
}

