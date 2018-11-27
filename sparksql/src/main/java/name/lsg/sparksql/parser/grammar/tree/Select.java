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
    public void indent(Context context){
        //IndentHelper.indent(context, "select");
        IndentHelper.indent(context, IndentHelper.keyword("select"));
        IndentHelper.indent(context, hints);
        IndentHelper.indent(context, quantifier);
        IndentHelper.indent(context, namedExpressionSeq);
        IndentHelper.indent(context, fromClause);
        IndentHelper.indent(context, literalViews);
        IndentHelper.indent(context, where);
        IndentHelper.indent(context, aggregation);
        IndentHelper.indent(context, having);
    }
}

