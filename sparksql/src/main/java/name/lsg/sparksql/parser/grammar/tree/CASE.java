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
    }

    public CASE(AST condExpr){
        this.condExpr = condExpr;
    }

    public void addWhen(AST clause){
        this.whenClause.add(clause);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "case");
        IndentHelper.indent(context, condExpr);
        IndentHelper.indentNoDelimeter(context, whenClause);
        if(elseExpr!=null){
            IndentHelper.indentKeyWord(context, "else");
            IndentHelper.indent(context, elseExpr);
        }
        IndentHelper.indentKeyWord(context, "end");
    }

}
