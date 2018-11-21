package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Identifier extends TargetAST {

    boolean quoted = false;
    String ident;
    public Identifier(String ident){
        this.ident = ident;
    }


    @Override
    public void confess(Context context ){
        context.confess(ident);
    }

    @Override
    public void ident(Context context ){
        IdentHelper.ident(context,ident);
    }

    @Override
    public boolean isTargetField(Context context){
        return context.isTargetField(ident);
    }

    @Override
    public DATE toDate(){
        return new DATE(ident);
    }

    @Override
    public BoolValue eq(AST ast){
        String i = ast.toString();
        return new BoolValue(StringUtils.compare(i, ident)==0);
    }

    @Override
    public BoolValue neq(AST ast){
        String i = ast.toString();
        return new BoolValue(StringUtils.compare(i, ident)!=0);
    }

}