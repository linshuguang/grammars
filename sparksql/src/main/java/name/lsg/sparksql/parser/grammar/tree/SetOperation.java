package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/12/2.
 */
@Data
public class SetOperation extends AST {
    AST left;
    String operator;
    AST qualifier;
    AST right;

    public SetOperation(AST left, String operator, AST right){
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, left);
        IndentHelper.indent(context, operator);
        if(qualifier!=null){
            IndentHelper.indent(context, qualifier);
        }
        IndentHelper.indent(context, right);
    }
}
