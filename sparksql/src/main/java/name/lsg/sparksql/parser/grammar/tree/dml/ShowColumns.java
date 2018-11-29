package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ShowColumns extends AST {
    String tableMethod;
    AST table;
    String dbMethod;
    AST db;

    public ShowColumns(String tableMethod,AST table,String dbMethod,AST db){
        this.tableMethod = tableMethod;
        this.table = table;
        this.dbMethod = dbMethod;
        this.db = db;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "SHOW","COLUMNS");
        IndentHelper.indentKeyWord(context, tableMethod);
        IndentHelper.indent(context, table);
        if(db!=null) {
            IndentHelper.indentKeyWord(context, dbMethod);
            IndentHelper.indent(context, db);
        }
    }

}
