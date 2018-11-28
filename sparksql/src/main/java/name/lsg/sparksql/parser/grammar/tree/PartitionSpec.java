package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class PartitionSpec extends AST {
    List<AST> partitions = new ArrayList<>();

    public void addPartition(AST partition){
        partitions.add(partition);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"PARTITION");
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,partitions);
        IndentHelper.indent(context,")");
    }

}
