package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/21.
 */
@Data
public class CASE extends AST {
    AST condExpr;
    List<AST> whenClause = new ArrayList<>();
    AST elseExpr;

    public CASE(){
        this.condExpr = null;
        this.elseExpr = null;
    }

    public CASE(AST condExpr){
        this.condExpr = condExpr;
        this.elseExpr = null;
    }

    public void addWhen(AST clause){
        this.whenClause.add(clause);
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context, IdentHelper.keyword("case"));
        IdentHelper.identNoDelimeter(context, whenClause);
        if(elseExpr!=null){
            IdentHelper.ident(context, IdentHelper.keyword("else"));
            IdentHelper.ident(context, elseExpr);
        }
        IdentHelper.ident(context, IdentHelper.keyword("end"));
    }

}
