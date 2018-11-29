package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class DescribeFunction extends AST {
    String desc;
    boolean extend;
    AST describeFuncName;

    public DescribeFunction(String desc, boolean extend, AST describeFuncName){
        this.desc = desc;
        this.extend = extend;
        this.describeFuncName= describeFuncName;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, desc);
        IndentHelper.indentKeyWord(context, "FUNCTION");
        if(extend){
            IndentHelper.indentKeyWord(context, "EXTENDED");
        }
        IndentHelper.indent(context, describeFuncName);
    }
}

