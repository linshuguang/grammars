package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class CreateTempViewUsing extends AST {
    boolean replace =false;
    boolean global =false;
    AST tableIdentifier;
    List<AST> colTypeList;
    AST tableProvider;
    AST tablePropertyList;

    public CreateTempViewUsing(boolean replace,boolean global, AST tableIdentifier,List<AST> colTypeList,AST tableProvider,AST tablePropertyList){
        this.replace = replace;
        this.global = global;
        this.tableIdentifier = tableIdentifier;
        this.colTypeList = colTypeList;
        this.tableProvider = tableProvider;
        this.tablePropertyList = tablePropertyList;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"CREATE");
        if(replace){
            IndentHelper.indentKeyWord(context,"OR","REPLACE");
        }
        if(global){
            IndentHelper.indentKeyWord(context,"GLOBAL");
        }
        IndentHelper.indentKeyWord(context,"TEMPORARY","VIEW");
        IndentHelper.indent(context,tableIdentifier);
        if(colTypeList!=null){
            IndentHelper.indent(context,"(");
            IndentHelper.indent(context,colTypeList);
            IndentHelper.indent(context,")");
        }
        IndentHelper.indent(context,tableProvider);
        if(tablePropertyList!=null){
            IndentHelper.indent(context,"OPTIONS");
            IndentHelper.indent(context,tablePropertyList);
        }
    }

}
