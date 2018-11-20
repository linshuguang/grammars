package name.lsg.grammar.tree;

import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class TableIdentifier extends AST{
    List<AST> identifierList = new ArrayList<>();

    public void addIdentifier(AST identifier){
        this.identifierList.add(identifier);
    }

    @Override
    public void confess(Context context){
        runConfess(context, identifierList);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, identifierList);
    }
}
