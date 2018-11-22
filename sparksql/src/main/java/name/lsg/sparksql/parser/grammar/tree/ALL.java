package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class ALL extends AST{
    @Override
    public void ident(Context context) {
        IdentHelper.ident(context, IdentHelper.keyword("all"));
    }
}
