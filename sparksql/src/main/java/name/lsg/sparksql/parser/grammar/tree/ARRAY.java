package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/21.
 */
public class ARRAY extends ComplexDataType {
    AST dataType;

    public ARRAY(AST dataType){
        this.dataType = dataType;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "array");
        IndentHelper.indent(context, "<");
        IndentHelper.indent(context, dataType);
        IndentHelper.indent(context, ">");
    }

}
