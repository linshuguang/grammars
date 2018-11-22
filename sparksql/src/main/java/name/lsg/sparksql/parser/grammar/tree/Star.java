package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Star extends AST{
    AST qualifiedName;

    public Star(){

    }

    public Star(AST qualifiedName){
        this.qualifiedName = qualifiedName;
    }

    @Override
    public void confess(Context context){
        if(qualifiedName!=null){
            String content = getRawContent(qualifiedName);
            runConfess(context, content+".*");
        }else {
            runConfess(context, "*");
        }
    }

    @Override
    public void ident(Context context){
        if(qualifiedName!=null){
            //String content = getRawContent(qualifiedName);
            IdentHelper.ident(context, qualifiedName,".*");
        }else {
            IdentHelper.ident(context, "*");
        }
    }

}