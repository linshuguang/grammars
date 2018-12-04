package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class StringLiteral extends AST{
    List<String> literalList = new ArrayList<>();

    public StringLiteral(){
    }

    public StringLiteral(String literal){
        literalList.add(literal);
    }

    public void addLiteral(String literal){
        literalList.add(literal);
    }

    @Override
    public void indent(Context context){
        String[] stockArr = new String[literalList.size()];
        stockArr = literalList.toArray(stockArr);
        IndentHelper.indent(context, stockArr);
    }

    @Override
    public DATE toDate(){
        return new DATE(StringUtils.join(literalList));
    }

    @Override
    public DATE evalDate(Context context){
        return new DATE(StringUtils.join(literalList));
    }
}