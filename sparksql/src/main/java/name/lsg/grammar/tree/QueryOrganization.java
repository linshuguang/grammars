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
public class QueryOrganization extends AST {

    List<AST> orderBy = new ArrayList<>();
    List<AST> clusterBy= new ArrayList<>();
    List<AST> distributeBy= new ArrayList<>();
    List<AST> sortBy= new ArrayList<>();
    AST windows;
    AST limit;

    public void addOrderItem(AST value){
        this.orderBy.add(value);
    }

    public void addClusterItem(AST value){
        this.clusterBy.add(value);
    }

    public void addDistributeItem(AST value){
        this.distributeBy.add(value);
    }

    public void addSortItem(AST value){
        this.sortBy.add(value);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, orderBy,IdentHelper.keyword("order"),IdentHelper.keyword("by"));
        IdentHelper.ident(context, clusterBy,IdentHelper.keyword("cluster"),IdentHelper.keyword("by"));
        IdentHelper.ident(context, distributeBy,IdentHelper.keyword("distribute"),IdentHelper.keyword("by"));
        IdentHelper.ident(context, sortBy,IdentHelper.keyword("sort"),IdentHelper.keyword("by"));
        IdentHelper.ident(context, limit);
    }


    @Override
    public void confess(Context context){
        if(orderBy.size()>0){
            runConfess(context, "order by");
        }
        runConfess(context, orderBy);

        if(clusterBy.size()>0){
            runConfess(context, "cluster by");
        }
        runConfess(context, clusterBy);

        if(distributeBy.size()>0){
            runConfess(context, "distribute by");
        }
        runConfess(context, distributeBy);

        if(sortBy.size()>0){
            runConfess(context, "sort by");
        }
        runConfess(context, sortBy);

        runConfess(context, limit);

    }

}
