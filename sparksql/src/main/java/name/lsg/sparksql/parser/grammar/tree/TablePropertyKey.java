package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
public class TablePropertyKey extends AST {
    String key;
    List<AST> keys = new ArrayList<>();

    public TablePropertyKey(){}

    public TablePropertyKey(String key){
        this.key = key;
    }

    public void addKey(AST identifier){
        keys.add(identifier);
    }

    @Override
    public void indent(Context context){
        if(key!=null){
            IndentHelper.indent(context, key);
        }else{
            IndentHelper.indent(context, concat(keys,'.'));
        }
    }

}
