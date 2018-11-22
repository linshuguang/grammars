package name.lsg.sparksql.parser.grammar.tree.join;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class AntiJOIN extends JOINType {

    public AntiJOIN(boolean left){
        this.left = left;
    }

    @Override
    public void confess(Context context){

        if(isLeft()){
            runConfess(context, "left");
        }
        runConfess(context, "anti");
    }

    @Override
    public void ident(Context context){

        if(isLeft()){
            IdentHelper.ident(context, "left");
        }
        IdentHelper.ident(context, "anti");
    }
}
