package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class NamedQuery extends AST {
    AST identifier;
    AST query;
    boolean hasAS ;

    public NamedQuery(AST identifier, AST query, boolean hasAS){
        this.identifier = identifier;
        this.query = query;
        this.hasAS = hasAS;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,identifier);
        if(hasAS){
            IndentHelper.indent(context, IndentHelper.keyword("as"));
        }
        IndentHelper.indent(context, "(");
        IndentHelper.indent(context, query);
        IndentHelper.indent(context, ")");
    }

}
