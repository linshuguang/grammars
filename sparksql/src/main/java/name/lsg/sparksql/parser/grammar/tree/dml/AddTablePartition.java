package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class AddTablePartition extends AST {
    AST tableIdentifier;
    boolean notExists = false;
    List<AST> partitionSpecLocation = new ArrayList<>();

    public AddTablePartition(AST tableIdentifier, boolean notExists){
        this.tableIdentifier = tableIdentifier;
        this.notExists = notExists;
    }

    public void addLocation(AST location){
        partitionSpecLocation.add(location);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER","TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indentKeyWord(context, "ADD");
        if(notExists) {
            IndentHelper.indentKeyWord(context, "IF","NOT", "EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpecLocation);
    }

}
