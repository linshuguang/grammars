package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class AddViewPartition extends AST {
    AST tableIdentifier;
    boolean notExists = false;
    List<AST> partitionSpec = new ArrayList<>();

    public AddViewPartition(AST tableIdentifier, boolean notExists){
        this.tableIdentifier = tableIdentifier;
        this.notExists = notExists;
    }

    public void addSpec(AST spec){
        partitionSpec.add(spec);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER","VIEW");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indentKeyWord(context, "ADD");
        if(notExists) {
            IndentHelper.indentKeyWord(context, "IF","NOT", "EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
    }
}
