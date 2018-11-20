package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;

/**
 * Created by kenya on 2018/11/13.
 */
public class TargetAST extends AST {

    @Override
    protected boolean isTargetAST(Context context){
        return true;
    }

}