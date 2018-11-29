package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class RefreshResource extends AST {
    String str;

    public  RefreshResource(){
    }
    public  RefreshResource(String str){
        this.str = str;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "REFRESH");
        IndentHelper.indent(context, str);
    }
}
