package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class MultiInsertQueryBody extends AST {
    AST querySpecification;
    AST queryOrganization;
    AST insertInto;

    public MultiInsertQueryBody(AST insertInto, AST querySpecification, AST queryOrganization){
        this.insertInto = insertInto;
        this.querySpecification = querySpecification;
        this.querySpecification = queryOrganization;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, insertInto);
        IndentHelper.indent(context, querySpecification);
        IndentHelper.indent(context, querySpecification);
    }

}
