package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class DropTablePartitions extends AST {
    AST tableIdentifier;
    List<AST> partitionSpecs = new ArrayList<>();
    boolean exists = false;
    boolean purge =false;

    public DropTablePartitions(AST tableIdentifier){
        this.tableIdentifier = tableIdentifier;
    }

    public void addPartitionSpec(AST partitionSpec){
        this.partitionSpecs.add(partitionSpec);
    }

    public void markExists(){
        exists= true;
    }

    public void markPurge(){
        purge = true;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER","TABLE");
        IndentHelper.indent(context,tableIdentifier);
        IndentHelper.indentKeyWord(context, "DROP");
        if(exists) {
            IndentHelper.indentKeyWord(context, "IF","EXISTS");
        }
        IndentHelper.indent(context,partitionSpecs);
        if(purge){
            IndentHelper.indentKeyWord(context, "PURGE");
        }
    }
}
