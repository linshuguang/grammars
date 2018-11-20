package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class NumberValue extends AST{
    boolean minus = false;
    String text;

    public NumberValue(){

    }

    private String trim(String str){
        return str.trim();
    }
    public NumberValue(boolean minus, String text){
        this.minus = minus;
        this.text = trim(text);
    }

    @Override
    public void confess(Context context){
        if(minus){
            runConfess(context, "-"+trim(text));
        }else{
            runConfess(context, trim(text));
        }
    }

    @Override
    public void ident(Context context){
        String t = text;
        if(minus){
            t = "-" + trim(text);
        }
        IdentHelper.ident(context,t);
    }


}
