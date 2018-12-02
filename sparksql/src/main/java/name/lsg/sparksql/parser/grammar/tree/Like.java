package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class Like extends Predicate {
    String like;
    AST pattern;
    boolean not;
    public Like(boolean not, String like, AST pattern){
        this.not = not;
        this.like = like;
        this.pattern = pattern;
    }

    @Override
    public void indent(Context context){
        if(not){
            IndentHelper.indentKeyWord(context,"not");
        }
        IndentHelper.indentKeyWord(context, like);
        IndentHelper.indent(context, pattern);
    }
}
