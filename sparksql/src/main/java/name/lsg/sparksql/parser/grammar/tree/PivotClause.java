package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class PivotClause extends AST {
    List<AST> aggregates;
    AST pivotColumn;
    List<AST> pivotValues = new ArrayList<>();

    public PivotClause(List<AST> aggregates, AST pivotColumn){
        this.aggregates = aggregates;
        this.pivotColumn = pivotColumn;
    }

    public void addPivot(AST pivotValue){
        this.pivotValues.add(pivotValue);
    }

    @Override
    public void indent(Context context){
        //PIVOT '(' aggregates=namedExpressionSeq FOR pivotColumn=identifier IN '(' pivotValues+=constant (',' pivotValues+=constant)* ')' ')'
        IndentHelper.indentKeyWord(context,"PIVOT");
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, aggregates);
        IndentHelper.indentKeyWord(context, "FOR");
        IndentHelper.indent(context, pivotColumn);
        IndentHelper.indentKeyWord(context, "IN");
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context,pivotValues);
        IndentHelper.indent(context,")");
        IndentHelper.indent(context,")");
    }

}
