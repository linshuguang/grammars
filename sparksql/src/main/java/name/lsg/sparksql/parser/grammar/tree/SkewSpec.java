package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class SkewSpec extends AST {
    AST skewBy;
    AST on;
    boolean asDir=false;

    public SkewSpec(AST skewBy, AST on){
        this.skewBy = skewBy;
        this.on = on;
    }

    public void markAsDir(){
        asDir = true;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"SKEWED", "BY");
        IndentHelper.indent(context, skewBy);
        IndentHelper.indentKeyWord(context,"on");
        IndentHelper.indent(context, on);
        if(asDir){
            IndentHelper.indentKeyWord(context,"STORED", "AS", "DIRECTORIES");
        }
    }

}
