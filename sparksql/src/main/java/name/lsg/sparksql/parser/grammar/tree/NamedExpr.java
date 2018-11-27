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
    public void indent(Context context){

        IndentHelper.indent(context, expr);
        if(isAs){
            IndentHelper.indent(context, IndentHelper.keyword("as"));
        }
        IndentHelper.indent(context, asList);
    }

}
