package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class DescribeDatabase extends AST {
    String desc;
    boolean extend;
    AST identifier;

    public DescribeDatabase(String desc, boolean extend, AST identifier){
        this.desc = desc;
        this.extend = extend;
        this.identifier= identifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, desc);
        IndentHelper.indentKeyWord(context, "DATABASE");
        if(extend){
            IndentHelper.indentKeyWord(context, "EXTENDED");
        }
        IndentHelper.indent(context, identifier);
    }
}
