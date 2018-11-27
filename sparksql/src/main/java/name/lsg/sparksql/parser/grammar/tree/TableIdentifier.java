package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

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
    public void indent(Context context){
        IndentHelper.indent(context, concat(identifierList,"."));
    }
}
