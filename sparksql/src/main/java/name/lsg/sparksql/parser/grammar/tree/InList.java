package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class InList extends Predicate {
    boolean not =false;
    List<AST> exprList = new ArrayList<>();

    public InList(boolean not){
        this.not = not;
    }

    public void addExpr(AST value){
        this.exprList.add(value);
    }

    @Override
    public void indent(Context context){
        if(not){
            IndentHelper.indent(context, IndentHelper.keyword("not"));
        }
        IndentHelper.indent(context, IndentHelper.keyword("in"));
        IndentHelper.indent(context,"(");
        for(int i = 0; i < exprList.size(); i++){
            IndentHelper.indent(context, exprList.get(i));
            if(i < exprList.size() - 1){
                IndentHelper.indent(context,",");
            }
        }
        IndentHelper.indent(context,")");

    }
}