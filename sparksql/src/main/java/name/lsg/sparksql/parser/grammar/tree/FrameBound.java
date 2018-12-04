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

    public FrameBound(String boundType){
        this.boundType = boundType;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, boundType);
    }

}
