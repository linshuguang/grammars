package name.lsg.sparksql.parser.grammar.tree.dml;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class DropDatabase extends AST {
    boolean exists = false;
    AST identifier;
    String appendix;

    public DropDatabase(boolean exists, AST identifier){
        this.exists = exists;
        this.identifier = identifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"DROP", "DATABASE");
        if(exists) {
            IndentHelper.indentKeyWord(context, "IF", "EXISTS");
        }
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, appendix);
    }
}
