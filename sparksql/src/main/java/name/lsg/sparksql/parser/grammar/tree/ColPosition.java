package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by kenya on 2018/11/28.
 */
public class ColPosition extends AST {
    String method;
    AST identifier=null;

    public ColPosition(String method, AST identifier){
        this.method = method;
        this.identifier = identifier;
    }

    public ColPosition(String method){
        this.method = method;
    }

    @Override
    public void indent(Context context){
        if(StringUtils.equalsIgnoreCase("FIRST",method)){
            IndentHelper.indent(context,IndentHelper.keyword("FIRST"));
        }else if(StringUtils.equalsIgnoreCase("AFTER",method)){
            IndentHelper.indent(context,IndentHelper.keyword("AFTER"));
            IndentHelper.indent(context,identifier);
        }
    }

}
