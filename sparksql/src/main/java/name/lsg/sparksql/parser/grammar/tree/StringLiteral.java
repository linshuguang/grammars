package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class StringLiteral extends AST{
    String literal;

    public StringLiteral(String literal){
        this.literal = literal;
    }

    @Override
    public void confess(Context context){
        runConfess(context, literal);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, literal);
    }

    @Override
    public DATE toDate(){
        return new DATE(literal);
    }

    @Override
    public DATE evalDate(Context context){
        return new DATE(literal);
    }
}