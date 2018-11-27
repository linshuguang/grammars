package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

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
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword("case"));
        IndentHelper.identNoDelimeter(context, whenClause);
        if(elseExpr!=null){
            IndentHelper.indent(context, IndentHelper.keyword("else"));
            IndentHelper.indent(context, elseExpr);
        }
        IndentHelper.indent(context, IndentHelper.keyword("end"));
    }

}
