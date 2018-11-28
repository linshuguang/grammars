package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class TableProvider extends AST {
    AST qualifiedName;

    public TableProvider(AST qualifiedName){
        this.qualifiedName = qualifiedName;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "USING");
        IndentHelper.indent(context, qualifiedName);
    }
}
