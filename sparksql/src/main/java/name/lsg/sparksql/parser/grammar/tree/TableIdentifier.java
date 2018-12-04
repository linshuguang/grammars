package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class TableIdentifier extends AST{
    List<AST> identifierList = new ArrayList<>();
    AST sample;

    public void addIdentifier(AST identifier){
        this.identifierList.add(identifier);
    }

    @Override
    public void confess(Context context){
        runConfess(context, identifierList);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, concat(identifierList,'.'));
        IndentHelper.indent(context, sample);
    }
}
