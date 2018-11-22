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
public class FunctionCall extends AST {
    AST qualifiedName;
    List<AST> arguments = new ArrayList<>();
    AST setQuantifier;
    AST windowSpec;

    public FunctionCall(AST qualifiedName){
        this.qualifiedName = qualifiedName;
    }

    public void addArgument(AST argument){
        this.arguments.add(argument);
    }

    @Override
    public void confess(Context context){
        runConfess(context,qualifiedName);
        runConfess(context,"(");
        runConfess(context, arguments);
        runConfess(context,")");
    }

    @Override
    public void ident(Context context){
        IdentHelper.ident(context,qualifiedName);
        IdentHelper.ident(context,"(");
        IdentHelper.ident(context, arguments);
        IdentHelper.ident(context,")");
    }

    @Override
    public AST eval(Context context){
        return null;
    }

}