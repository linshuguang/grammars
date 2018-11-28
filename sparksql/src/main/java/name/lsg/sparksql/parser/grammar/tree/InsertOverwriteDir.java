package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class InsertOverwriteDir extends AST {
    boolean local;
    String path;
    AST tableProvider;
    AST tablePropertyList;

    @Override
    public void indent(Context context){
        //INSERT OVERWRITE LOCAL? DIRECTORY (path=STRING)? tableProvider (OPTIONS options=tablePropertyList)?   #insertOverwriteDir
        IndentHelper.indentKeyWord(context, "INSERT","OVERWRITE");
        if(local) {
            IndentHelper.indentKeyWord(context, "local");
        }
        IndentHelper.indentKeyWord(context, "DIRECTORY");
        IndentHelper.indent(context, path);
        IndentHelper.indent(context, tableProvider);
        if(tablePropertyList!=null){
            IndentHelper.indentKeyWord(context, "OPTIONS");
            IndentHelper.indent(context, tablePropertyList);
        }

    }
}
