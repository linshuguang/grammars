package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenya on 2018/11/21.
 */
public class MAP extends ComplexDataType {

    AST key;
    AST val;

    public MAP(AST key, AST val){
        this.key = key;
        this.val = val;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "map");
        IndentHelper.indent(context, "<");
        IndentHelper.indent(context, key);
        IndentHelper.indent(context, ",");
        IndentHelper.indent(context, val);
        IndentHelper.indent(context, ">");
    }
}
