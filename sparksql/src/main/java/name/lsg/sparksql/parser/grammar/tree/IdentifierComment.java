package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class IdentifierComment extends AST{
    AST identifier;
    String comment;

    public IdentifierComment(AST identifier){
        this.identifier = identifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        if(comment!=null) {
            IndentHelper.indentKeyWord(context,"COMMENT");
            IndentHelper.indent(context, comment);
        }
    }

}
