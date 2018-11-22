package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

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
    public void ident(Context context){
        if(not){
            IdentHelper.ident(context,IdentHelper.keyword("not"));
        }
        IdentHelper.ident(context,IdentHelper.keyword("in"));
        IdentHelper.ident(context,"(");
        for(int i = 0; i < exprList.size(); i++){
            IdentHelper.ident(context, exprList.get(i));
            if(i < exprList.size() - 1){
                IdentHelper.ident(context,",");
            }
        }
        IdentHelper.ident(context,")");

    }
}