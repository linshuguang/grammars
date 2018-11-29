package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
public class LoadData extends AST {

    boolean local;
    String path;
    boolean overwrite;
    AST tableIdentifier;
    AST partitionSpec;

    public LoadData(boolean local,String path,boolean overwrite,AST tableIdentifier,AST partitionSpec){
        this.local = local;
        this.path = path;
        this.overwrite = overwrite;
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "LOAD","DATA");
        if(local) {
            IndentHelper.indentKeyWord(context, "LOCAL");
        }
        IndentHelper.indentKeyWord(context, "INPATH");

        IndentHelper.indent(context, path);

        if(overwrite) {
            IndentHelper.indentKeyWord(context, "OVERWRITE");
        }
        IndentHelper.indentKeyWord(context, "INTO","TABLE");

        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
    }
}

