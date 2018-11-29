package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class AlterViewQuery extends AST {
    AST tableIdentifier;
    boolean as;
    AST query;

    public AlterViewQuery(AST tableIdentifier, boolean as, AST query){
        this.tableIdentifier = tableIdentifier;
        this.as = as;
        this.query = query;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ALTER","VIEW");
        IndentHelper.indent(context, tableIdentifier);
        if(as){
            IndentHelper.indentKeyWord(context, "AS");
        }
        IndentHelper.indent(context, query);
    }
}
