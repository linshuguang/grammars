package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Select extends AST {

    AST inRowFormat;
    AST outRowFormat;
    String recordWriter;
    String kind;
    String script;
    String recordReader;
    AST as;
    List<AST> hints = new ArrayList<>();
    AST quantifier;
    List<AST> namedExpressionSeq;
    AST fromClause;
    List<AST>literalViews = new ArrayList<>();

    AST where;
    AST aggregation;
    AST having;
    AST windows;
    boolean normal = true;

    public void addLiteralView(AST value){
        this.literalViews.add(value);
    }

    public void addHint(AST hint) { this.hints.add(hint);}

    public void markAbnormal(){
        normal = false;
    }

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

        if(StringUtils.equalsIgnoreCase(kind,"select")) {

            if(normal) {
                IndentHelper.indentKeyWord(context, "select");
                IndentHelper.indent(context, hints);
                IndentHelper.indent(context, quantifier);
                IndentHelper.indent(context, namedExpressionSeq);
                IndentHelper.indent(context, fromClause);
            }else{
                IndentHelper.indent(context, fromClause);
                IndentHelper.indentKeyWord(context, "select");
                IndentHelper.indent(context, quantifier);
                IndentHelper.indent(context, namedExpressionSeq);
            }

            IndentHelper.indent(context, literalViews);
            IndentHelper.indent(context, where);
            IndentHelper.indent(context, aggregation);
            IndentHelper.indent(context, having);
            IndentHelper.indent(context, windows);
        }else{
            if(StringUtils.equalsIgnoreCase(kind,"TRANSFORM")){
                IndentHelper.indentKeyWord(context, "SELECT","TRANSFORM");
                IndentHelper.indent(context, "(");
                IndentHelper.indent(context, namedExpressionSeq);
                IndentHelper.indent(context, ")");
            }else if(StringUtils.equalsIgnoreCase(kind,"MAP")){
                IndentHelper.indentKeyWord(context, "MAP");
                IndentHelper.indent(context, namedExpressionSeq);
            }else if(StringUtils.equalsIgnoreCase(kind,"REDUCE")){
                IndentHelper.indentKeyWord(context, "REDUCE");
                IndentHelper.indent(context, namedExpressionSeq);
            }
            IndentHelper.indent(context, inRowFormat);
            if(recordWriter!=null){
                IndentHelper.indentKeyWord(context, "RECORDWRITER");
                IndentHelper.indent(context, recordWriter);
            }

            IndentHelper.indentKeyWord(context, "USING");
            IndentHelper.indent(context, script);


            if(as!=null){
                IndentHelper.indentKeyWord(context, "as");
                IndentHelper.indent(context, as);
            }
            IndentHelper.indent(context, outRowFormat);

            if(recordReader!=null) {
                IndentHelper.indentKeyWord(context, "RECORDREADER");
                IndentHelper.indent(context, recordReader);
            }

            IndentHelper.indent(context, fromClause);
            if(where!=null){
                IndentHelper.indentKeyWord(context, "where");
                IndentHelper.indent(context, where);
            }


        }
    }
}

