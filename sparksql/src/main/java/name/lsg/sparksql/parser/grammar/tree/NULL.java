package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.lang.annotation.Inherited;

/**
 * Created by kenya on 2018/11/13.
 */
public class NULL extends AST {
    @Override
    public void indent(Context context){
        IndentHelper.indent(context, "NULL");
    }
}