package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class FromClause extends AST {
    List<AST> relationList = new ArrayList<>();
    List<AST>lateralViewList = new ArrayList<>();
    AST pivotClause;

    public void addRelation(AST relation){
        this.relationList.add(relation);
    }

    public void addLateralView(AST lateralView){
        this.lateralViewList.add(lateralView);
    }

    @Override
    public void confess(Context context){
        runConfess(context, "from");
        runConfess(context, relationList);
        runConfess(context, lateralViewList);
        runConfess(context, pivotClause);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("from"));
        IndentHelper.indent(context, relationList);
        IndentHelper.indent(context, lateralViewList);
        IndentHelper.indent(context, pivotClause);
    }

}
