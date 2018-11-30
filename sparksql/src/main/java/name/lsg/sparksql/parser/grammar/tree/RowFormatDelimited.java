package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
@Data
public class RowFormatDelimited extends AST {
    String fieldsTerminatedBy;
    String escapedBy;
    String collectionItemsTerminatedBy;
    String keysTerminatedBy;
    String linesSeparatedBy;
    String nullDefinedAs;

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "ROW", "FORMAT", "DELIMITED");
        if(fieldsTerminatedBy!=null){
            IndentHelper.indentKeyWord(context, "FIELDS", "TERMINATED", "BY");
            IndentHelper.indent(context, fieldsTerminatedBy);
            if(escapedBy!=null) {
                IndentHelper.indentKeyWord(context, "ESCAPED", "BY");
                IndentHelper.indent(context, escapedBy);
            }
        }
        if(collectionItemsTerminatedBy!=null){
            IndentHelper.indentKeyWord(context, "COLLECTION", "ITEMS","TERMINATED", "BY");
            IndentHelper.indent(context, collectionItemsTerminatedBy);
        }
        if(keysTerminatedBy!=null){
            IndentHelper.indentKeyWord(context,"MAP", "KEYS", "TERMINATED", "BY");
            IndentHelper.indent(context, keysTerminatedBy);
        }
        if(linesSeparatedBy!=null){
            IndentHelper.indentKeyWord(context,"LINES", "TERMINATED", "BY");
            IndentHelper.indent(context, linesSeparatedBy);
        }
        if(nullDefinedAs!=null){
            IndentHelper.indentKeyWord(context,"NULL", "DEFINED", "AS");
            IndentHelper.indent(context, nullDefinedAs);
        }
    }

}
