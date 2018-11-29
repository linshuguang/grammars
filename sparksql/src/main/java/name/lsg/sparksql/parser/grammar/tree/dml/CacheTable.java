package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class CacheTable extends AST {
    boolean lazy;
    AST tableIdentifier;
    boolean as;
    AST query;
    //CACHE LAZY? TABLE tableIdentifier (AS? query)?
    public CacheTable(boolean lazy,AST tableIdentifier,boolean as,AST query){
        this.lazy = lazy;
        this.tableIdentifier = tableIdentifier;
        this.as = as;
        this.query = query;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"CACHE");
        if(lazy) {
            IndentHelper.indentKeyWord(context, "LAZY");
        }
        IndentHelper.indentKeyWord(context,"TABLE");
        IndentHelper.indent(context,tableIdentifier);
        if(query!=null){
            if(as){
                IndentHelper.indentKeyWord(context,"as");
            }
            IndentHelper.indent(context,query);
        }
    }
}
