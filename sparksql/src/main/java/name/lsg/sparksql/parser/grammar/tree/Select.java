package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Select extends AST {

    List<AST> hints = new ArrayList<>();
    AST quantifier;
    List<AST> namedExpressionSeq;
    AST fromClause;
    List<AST>literalViews = new ArrayList<>();

    AST where;
    AST aggregation;
    AST having;
    //List<AST> windows;

    public void addLiteralView(AST value){
        this.literalViews.add(value);
    }

    public void addHint(AST hint) { this.hints.add(hint);}

    @Override
    public void confess(Context context){


        runConfess(context,"SELECT");
        runConfess(context, hints);
        runConfess(context, quantifier);
        runConfess(context, namedExpressionSeq);
        runConfess(context, fromClause);
        runConfess(context, literalViews);
        runConfess(context, where);
        runConfess(context, aggregation);
        runConfess(context, having);
    }

    @Override
    public void ident(Context context){
        //IdentHelper.ident(context, "select");
        IdentHelper.ident(context, IdentHelper.keyword("select"));
        IdentHelper.ident(context, hints);
        IdentHelper.ident(context, quantifier);
        IdentHelper.ident(context, namedExpressionSeq);
        IdentHelper.ident(context, fromClause);
        IdentHelper.ident(context, literalViews);
        IdentHelper.ident(context, where);
        IdentHelper.ident(context, aggregation);
        IdentHelper.ident(context, having);
    }
}

