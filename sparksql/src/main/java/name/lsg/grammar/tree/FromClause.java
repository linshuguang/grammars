package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

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
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("from"));
        IdentHelper.ident(context, relationList);
        IdentHelper.ident(context, lateralViewList);
        IdentHelper.ident(context, pivotClause);
    }

}
