package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class FrameBound extends AST {
    String boundType;
    String subType=null;
    AST expr;

    public FrameBound(String boundType){
        this.boundType = boundType;
    }

    @Override
    public void indent(Context context){
        if(StringUtils.equalsIgnoreCase("UNBOUNDED",subType)){
            IndentHelper.indent(context, IndentHelper.keyword("UNBOUNDED"));
            IndentHelper.indent(context, IndentHelper.keyword(boundType));
        }else if(StringUtils.equalsIgnoreCase("ROW",subType)){
            IndentHelper.indent(context, IndentHelper.keyword(boundType));
            IndentHelper.indent(context, IndentHelper.keyword("ROW"));
        }else{
            IndentHelper.indent(context, expr);
            IndentHelper.indent(context, IndentHelper.keyword(boundType));
        }
    }

}
