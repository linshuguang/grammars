package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Query extends  AST{
    AST with;
    AST queryNoWith;

    @Override
    public void confess(Context context){
        if(with!=null){
            with.confess(context);
        }
        if(queryNoWith!=null){
            queryNoWith.confess(context);
        }
    }

    @Override
    public void indent(Context context) {
        IndentHelper.indent(context, with);
        IndentHelper.indent(context, queryNoWith);
    }


}

