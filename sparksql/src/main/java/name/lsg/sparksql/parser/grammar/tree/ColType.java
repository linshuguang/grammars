package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class ColType extends AST {
    AST identifier;
    AST dataType;
    String comment=null;

    public ColType(AST identifier, AST dataType){
        this.identifier = identifier;
        this.dataType = dataType;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        IndentHelper.indent(context, dataType);
        if(comment!=null){
            IndentHelper.indent(context,IndentHelper.keyword("COMMENT"));
            IndentHelper.indent(context, comment);
        }
    }
}
