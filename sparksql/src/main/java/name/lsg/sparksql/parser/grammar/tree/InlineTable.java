package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class InlineTable extends AST {
    List<AST> exprList = new ArrayList<>();
    AST tableAlias;

    public void addExpr(AST expr){
        exprList.add(expr);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"VALUES");
        IndentHelper.indent(context, exprList);
        IndentHelper.indent(context, tableAlias);
    }
}
