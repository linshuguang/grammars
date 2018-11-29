package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class BucketSpec extends AST {
    AST identifierList;
    AST orderedIdentifierList;
    String value;

    public BucketSpec(AST identifierList,AST orderedIdentifierList, String value ){
        this.identifierList = identifierList;
        this.orderedIdentifierList = orderedIdentifierList;
        this.value = value;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"CLUSTERED", "BY");
        IndentHelper.indent(context, identifierList);
        if(orderedIdentifierList!=null){
            IndentHelper.indentKeyWord(context,"SORTED", "BY");
            IndentHelper.indent(context, orderedIdentifierList);
        }
        IndentHelper.indentKeyWord(context,"INTO");
        IndentHelper.indent(context, value);
        IndentHelper.indentKeyWord(context,"BUCKETS");
    }

}
