package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Identifier extends TargetAST {

    boolean quoted = false;
    String indent;
    public Identifier(String indent){
        this.indent = indent;
    }


    @Override
    public void confess(Context context ){
        context.confess(indent);
    }

    @Override
    public void indent(Context context ){
        IndentHelper.indent(context,indent);
    }

    @Override
    public boolean isTargetField(Context context){
        return context.isTargetField(indent);
    }

    @Override
    public DATE toDate(){
        return new DATE(indent);
    }

    @Override
    public BoolValue eq(AST ast){
        String i = ast.toString();
        return new BoolValue(StringUtils.compare(i, indent)==0);
    }

    @Override
    public BoolValue neq(AST ast){
        String i = ast.toString();
        return new BoolValue(StringUtils.compare(i, indent)!=0);
    }

}