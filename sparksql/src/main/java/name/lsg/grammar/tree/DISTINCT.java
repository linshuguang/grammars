package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class DISTINCT extends AST {
    @Override
    public void ident(Context context) {
        IdentHelper.ident(context, IdentHelper.keyword("distinct"));
    }
}
