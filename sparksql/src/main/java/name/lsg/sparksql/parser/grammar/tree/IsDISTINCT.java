package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class IsDISTINCT extends Predicate {
    AST right;
    boolean not;

    public IsDISTINCT(boolean not, AST right){
        this.not = not;
        this.right = right;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("is"));
        if(not){
            IndentHelper.indent(context, IndentHelper.keyword("not"));
        }
        IndentHelper.indent(context, IndentHelper.keyword("DISTINCT"));
        IndentHelper.indent(context, IndentHelper.keyword("FROM"));
        IndentHelper.indent(context, right);
    }
}
