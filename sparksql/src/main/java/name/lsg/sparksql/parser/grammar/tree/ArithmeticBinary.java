package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.context.ContextFactory;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class ArithmeticBinary extends AST {

    AST left;
    String operator;
    AST right;

    public ArithmeticBinary(AST left, String operator, AST right){
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    private boolean isTarget(Context context){
        return  context.isTargetOperator(operator)
                && left != null
                && left.isTargetAST(context)
                && left.isTargetField(context);
    }


    @Override
    public void confess(Context context){

        if(isTarget(context)){
            Context context1 = ContextFactory.create();
            runConfess(context1, left);
            runConfess(context1, operator);
            runConfess(context1, right);
            context.addPredicate(this);

            runConfess(context, "1=1");
        }else {

            runConfess(context, left);
            runConfess(context, operator);
            runConfess(context, right);
        }
    }

    @Override
    public AST steam(Context context){
        AST l = left.evalDate(context);
        AST r = right.evalDate(context);

        if(l==null || r==null){
            return null;
        }

        if("=".equals(operator)){
            return l.eq(r);
        }else if("<=>".equals(operator)){
            return l.nseq(r);
        }else if("<>".equals(operator)){
            return l.neq(r);
        }else if("!=".equals(operator)){
            return l.neqj(r);
        }else if(">".equals(operator)){
            return l.gt(r);
        }else if(">=".equals(operator) || "!>".equals(operator)){
            return l.gte(r);
        }else if("<".equals(operator)){
            return l.lt(r);
        }else if("<=".equals(operator) || "!<".equals(operator)){
            return l.lte(r);
        }

        return null;
    }

    @Override
    public String confessPredicator(Context context){

        if(isTarget(context)){
            String str = getRawContent(left);

            int i = str.indexOf('.');
            return str.substring(0,i);

        }

        return null;
    }


    @Override
    public void indent(Context context){

        IndentHelper.indent(context, left);
        IndentHelper.indent(context, IndentHelper.keyword(operator));
        IndentHelper.indent(context, right);
    }
}
