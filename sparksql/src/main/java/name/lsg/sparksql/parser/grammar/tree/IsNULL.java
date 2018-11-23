package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class IsNULL extends Predicate {
    boolean not = false;
    public IsNULL(boolean not){
        this.not = not;
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,IdentHelper.keyword("is"));
        if(not){
            IdentHelper.ident(context,IdentHelper.keyword("not"));
        }
        IdentHelper.ident(context,IdentHelper.keyword("null"));
    }

}