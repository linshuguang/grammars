package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class NamedWindow extends AST{
    AST identifier;
    AST windowSpec;

    public NamedWindow(AST identifier, AST windowSpec){
        this.identifier = identifier;
        this.windowSpec = windowSpec;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, IndentHelper.keyword("as"));
        IndentHelper.indent(context, windowSpec);
    }

}
