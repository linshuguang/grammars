package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class ShowDatabases extends AST {
    boolean like =false;
    String pattern;

    public ShowDatabases(boolean like, String pattern){
        this.like = like;
        this.pattern = pattern;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "SHOW","DATABASES");
        if(pattern!=null){
            if(like){
                IndentHelper.indentKeyWord(context, "LIKE");
            }
            IndentHelper.indent(context, pattern);
        }
    }
}
