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
    public void indent(Context context){
        IndentHelper.indent(context, orderBy, IndentHelper.keyword("order"), IndentHelper.keyword("by"));
        IndentHelper.indent(context, clusterBy, IndentHelper.keyword("cluster"), IndentHelper.keyword("by"));
        IndentHelper.indent(context, distributeBy, IndentHelper.keyword("distribute"), IndentHelper.keyword("by"));
        IndentHelper.indent(context, sortBy, IndentHelper.keyword("sort"), IndentHelper.keyword("by"));
        IndentHelper.indent(context, limit);
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
