package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class TableFileFormat extends FileFormat {
    String inFmt;
    String outFmt;

    public TableFileFormat(String inFmt, String outFmt){
        this.inFmt = inFmt;
        this.outFmt = outFmt;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("INPUTFORMAT"));
        IndentHelper.indent(context, inFmt);
        IndentHelper.indent(context, IndentHelper.keyword("OUTPUTFORMAT"));
        IndentHelper.indent(context, outFmt);
    }

}
