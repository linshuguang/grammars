package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class GroupingSet extends AST {
    List<AST> exprList = new ArrayList<>();
    AST expr;

    public GroupingSet(){
    }

    public GroupingSet(AST expr){
        this.expr = expr;
    }

    public void addExpr(AST ast){
        exprList.add(ast);
    }

    @Override
    public void indent(Context context){
        if(exprList.size()==0){
            IndentHelper.indent(context, expr);
        }else{
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, exprList);
            IndentHelper.indent(context, ")");
        }
    }


}
