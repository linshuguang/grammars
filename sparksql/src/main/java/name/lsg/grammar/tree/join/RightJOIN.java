package name.lsg.grammar.tree.join;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class RightJOIN extends JOINType {

    @Override
    public void confess(Context context){
        runConfess(context, "right");
        if(isOuter()){
            runConfess(context, "outer");
        }
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, "right");
        if(isOuter()){
            IdentHelper.ident(context, "outer");
        }
    }
}
