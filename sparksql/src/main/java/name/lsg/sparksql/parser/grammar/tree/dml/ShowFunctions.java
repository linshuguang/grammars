package name.lsg.sparksql.parser.grammar.tree.dml;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class ShowFunctions extends AST {
    AST identifier;
    boolean like =false;
    AST qualifiedName;
    String pattern;

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "SHOW");
        IndentHelper.indent(context, identifier);
        IndentHelper.indentKeyWord(context, "FUNCTIONS");
        if(qualifiedName!=null || pattern!=null){
            if(like){
                IndentHelper.indentKeyWord(context, "LIKE");
            }
            if(qualifiedName!=null){
                IndentHelper.indent(context, qualifiedName);
            }else if(pattern!=null){
                IndentHelper.indent(context, pattern);
            }
        }
    }
}
