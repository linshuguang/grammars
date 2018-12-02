package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class INTERVAL extends AST {
    List<AST> intervalFields = new ArrayList<>();

    public void addIntervalField(AST value){
        this.intervalFields.add(value);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"INTERVAL");
        IndentHelper.indent(context,intervalFields);
    }
}