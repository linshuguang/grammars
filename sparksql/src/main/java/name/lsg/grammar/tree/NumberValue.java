package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class NumberValue extends AST{
    boolean minus = false;
    String text;

    public NumberValue(){

    }

    public NumberValue(boolean minus, String text){
        this.minus = minus;
        this.text = text;
    }

    @Override
    public void confess(Context context){
        if(minus){
            runConfess(context, "-"+text);
        }else{
            runConfess(context, text);
        }
    }


}
