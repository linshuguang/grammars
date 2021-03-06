package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Limit extends AST {
    AST expr=null;

    public Limit(AST expr){
        this.expr = expr;
    }
    public Limit(){
    }

    @Autowired
    public void confess(Context context){
        runConfess(context,"limit");
        runConfess(context, expr);
    }

    @Autowired
    public void indent(Context context){
        IndentHelper.indent(context,"limit");
        IndentHelper.indent(context, expr);
    }
}
