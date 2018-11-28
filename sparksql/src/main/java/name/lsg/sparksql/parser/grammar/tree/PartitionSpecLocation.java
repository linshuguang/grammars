package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class PartitionSpecLocation extends AST {
    AST partition;
    AST location;

    public PartitionSpecLocation(AST partition){
        this.partition = partition;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, partition);
        IndentHelper.indent(context, location);
    }

}
