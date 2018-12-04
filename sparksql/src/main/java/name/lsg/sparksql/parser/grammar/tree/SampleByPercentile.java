package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by kenya on 2018/11/29.
 */
public class SampleByPercentile extends AST {
    String negativeSign;
    String percentage;

    public SampleByPercentile(String negativeSign, String percentage){
        this.negativeSign = negativeSign;
        this.percentage = percentage;
    }

    @Override
    public void indent(Context context){
        if(!StringUtils.isBlank(negativeSign)){
            IndentHelper.indent(context, negativeSign);
        }
        IndentHelper.indent(context, percentage);
        IndentHelper.indentKeyWord(context, "PERCENT");
    }
}
