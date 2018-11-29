package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class SampleByBucket extends AST {
    String numerator;
    String denominator;
    AST identifier;
    AST qualifiedName;

    public SampleByBucket(String numerator, String denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "BUCKET");
        IndentHelper.indent(context, numerator);
        IndentHelper.indentKeyWord(context, "OF");
        IndentHelper.indent(context, denominator);
        if(identifier!=null || qualifiedName!=null){
            IndentHelper.indentKeyWord(context, "ON");
            if(identifier!=null){
                IndentHelper.indent(context, identifier);
            }else{
                IndentHelper.indent(context, qualifiedName);
                IndentHelper.indent(context, "(");
                IndentHelper.indent(context, ")");
            }
        }
    }


}
