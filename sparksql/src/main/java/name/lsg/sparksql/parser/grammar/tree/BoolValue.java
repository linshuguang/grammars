package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class BoolValue extends AST {
    boolean bool ;

    public BoolValue(boolean bool){
        this.bool = bool;
    }

    @Override
    public boolean toBoolean(){
        return bool;
    }

    @Override
    public void indent(Context context){
        if(bool){
            IndentHelper.indent(context, "true");
        }else{
            IndentHelper.indent(context, "false");
        }
    }
}
