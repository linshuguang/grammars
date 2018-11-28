package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class PartitionVal extends AST {
    AST identifier;
    AST constant;

    public PartitionVal(AST identifier){
        this.identifier = identifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        if(constant!=null) {
            IndentHelper.indent(context, IndentHelper.keyword("eq"));
            IndentHelper.indent(context, constant);
        }
    }
}
