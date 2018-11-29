package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class DropFunction extends AST {
    boolean temporary = false;
    boolean exists = false;
    AST qualifiedName;

    public DropFunction(boolean temporary ,boolean exists,AST qualifiedName){
        this.temporary = temporary;
        this.exists = exists;
        this.qualifiedName = qualifiedName;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"DROP" );
        if(temporary){
            IndentHelper.indentKeyWord(context,"TEMPORARY" );
        }
        IndentHelper.indentKeyWord(context,"FUNCTION" );
        if(exists){
            IndentHelper.indentKeyWord(context,"IF","EXISTS" );
        }
        IndentHelper.indent(context, qualifiedName);
    }
}
