package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class FunctionIdentifier extends AST {
    AST db = null;
    AST function;

    @Override
    public void indent(Context context){
        if(db!=null){
            String msg = getRawContent(db) + "." +getRawContent(function);
            IndentHelper.indent(context, msg);
        }else{
            IndentHelper.indent(context, function);
        }
    }

}
