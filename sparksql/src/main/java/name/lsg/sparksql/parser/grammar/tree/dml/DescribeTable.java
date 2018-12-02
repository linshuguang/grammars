package name.lsg.sparksql.parser.grammar.tree.dml;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class DescribeTable extends AST {

    String desc;
    boolean table;
    String option;
    AST tableIdentifier;
    AST partitionSpec;
    AST describeColName;

    public DescribeTable(String desc,boolean table,AST tableIdentifier){
        this.desc = desc;
        this.table = table;
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, desc);
        if(table) {
            IndentHelper.indentKeyWord(context, "TABLE");
        }
        if(option!=null) {
            IndentHelper.indentKeyWord(context, option);
        }
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
        IndentHelper.indent(context, describeColName);
    }
}
