package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class SubQuery extends AST {
    AST queryNoWith;

    public SubQuery(AST queryNoWith){
        this.queryNoWith = queryNoWith;
    }

    @Override
    public void confess(Context context){
        runConfess(context, queryNoWith);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, queryNoWith);
    }

    @Override
    public AST steam(Context context){
        return queryNoWith.steam(context);
    }
}