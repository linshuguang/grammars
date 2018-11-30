package name.lsg.sparksql.parser.grammar.tree.ddl;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class CreateTableLike extends AST {
    boolean notExists = false;
    AST target;
    AST source;
    AST locationSpec;

    public CreateTableLike(boolean notExists, AST target, AST source){
        this.notExists = notExists;
        this.target = target;
        this.source = source;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "CREATE", "TABLE");
        if(notExists) {
            IndentHelper.indentKeyWord(context, "IF", "NOT", "EXISTS");
        }
        IndentHelper.indent(context, target);
        IndentHelper.indentKeyWord(context, "LIKE");
        IndentHelper.indent(context, source);
        IndentHelper.indent(context, locationSpec);
    }


}
