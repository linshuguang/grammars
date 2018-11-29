package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ShowTblProperties extends AST {

    AST table ;
    AST key;
    public ShowTblProperties(AST table, AST key){
        this.table = table;
        this.key = key;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "SHOW","TBLPROPERTIES");
        IndentHelper.indent(context, table);
        if(key!=null){
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, key);
            IndentHelper.indent(context, ")");
        }
    }
}
