package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;

/**
 * Created by kenya on 2018/11/13.
 */
public class TargetAST extends AST {

    @Override
    protected boolean isTargetAST(Context context){
        return true;
    }

}