package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class InsertOverwriteHiveDir extends AST {
    boolean local;
    String path;
    AST rowFormat;
    AST createFileFormat;

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"INSERT","OVERWRITE");
        if(local){
            IndentHelper.indentKeyWord(context,"local");
        }
        IndentHelper.indentKeyWord(context,"DIRECTORY");
        IndentHelper.indent(context, rowFormat);
        IndentHelper.indent(context, createFileFormat);
    }

}
