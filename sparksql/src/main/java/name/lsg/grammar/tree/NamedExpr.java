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
public class NamedExpr extends AST {
    AST expr;
    List<AST> asList = new ArrayList<>();
    boolean isAs = false;

    public NamedExpr(){}
    public NamedExpr(AST expr){
        this.expr = expr;
    }

    public void markAS(){
        isAs = true;
    }

    public void addAS(List<AST> asList){
        this.asList.addAll(asList);
    }

    public void addAS(AST as){
        this.asList.add(as);
    }

    @Override
    public void confess(Context context){
        runConfess(context, expr);
        runConfess(context, asList);
    }

    @Override
    public void ident(Context context){

        IdentHelper.ident(context, expr);
        if(isAs){
            IdentHelper.ident(context, IdentHelper.keyword("as"));
        }
        IdentHelper.ident(context, asList);
    }

}
