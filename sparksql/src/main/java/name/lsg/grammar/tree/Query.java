package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Query extends  AST{
    AST with;
    AST queryNoWith;

    @Override
    public void confess(Context context){
        if(with!=null){
            with.confess(context);
        }
        if(queryNoWith!=null){
            queryNoWith.confess(context);
        }
    }

    @Override
    public void ident(Context context) {
        IdentHelper.ident(context, with);
        IdentHelper.ident(context, queryNoWith);
    }


}

