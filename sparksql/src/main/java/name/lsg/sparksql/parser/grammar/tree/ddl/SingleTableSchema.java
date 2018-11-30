package name.lsg.sparksql.parser.grammar.tree.ddl;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/30.
 */
public class SingleTableSchema extends AST{
    List<AST> colTypeList;

    public SingleTableSchema(List<AST> colTypeList){
        this.colTypeList = colTypeList;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, colTypeList);
    }
}
