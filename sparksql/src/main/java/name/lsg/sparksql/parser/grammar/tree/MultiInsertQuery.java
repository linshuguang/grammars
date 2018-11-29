package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class MultiInsertQuery extends AST {
    AST fromClause;
    List<AST>multiInsertQueryBody = new ArrayList<>();

    public MultiInsertQuery(AST fromClause){
        this.fromClause = fromClause;
    }


    public void addInsert(AST insert){
        multiInsertQueryBody.add(insert);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, fromClause);
        IndentHelper.indentWithDelimeter(context, multiInsertQueryBody, " ");
    }


}
