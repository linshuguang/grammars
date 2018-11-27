package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class IsNULL extends Predicate {
    boolean not = false;
    public IsNULL(boolean not){
        this.not = not;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("is"));
        if(not){
            IndentHelper.indent(context, IndentHelper.keyword("not"));
        }
        IndentHelper.indent(context, IndentHelper.keyword("null"));
    }

}