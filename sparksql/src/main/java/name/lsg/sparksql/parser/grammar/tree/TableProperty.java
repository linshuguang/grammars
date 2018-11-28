package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class TableProperty extends AST {
    AST key ;
    AST value;
    boolean eq=false;

    public TableProperty(AST key){
        this.key = key;
    }


    @Override
    public void indent(Context context){
        IndentHelper.indent(context, key);
        if(value!=null){
            if(eq){
                IndentHelper.indent(context, IndentHelper.keyword("EQ"));
            }
            IndentHelper.indent(context,value);
        }
    }

}
