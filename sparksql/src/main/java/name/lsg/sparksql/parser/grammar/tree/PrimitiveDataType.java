package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/21.
 */
public class PrimitiveDataType extends DataType {
    AST identifier;
    List<AST> valueList;

    public PrimitiveDataType(AST identifier){
        this.identifier = identifier;
        this.valueList = new ArrayList<>();
    }

    public void addValue(AST value){
        this.valueList.add(value);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, identifier);
        if(valueList.size()>0){
            IndentHelper.indent(context, "(");
            for(int i = 0; i < valueList.size(); i++){
                IndentHelper.indent(context,valueList.get(i));
                if(i<valueList.size()-1){
                    IndentHelper.indent(context, ",");
                }
            }
            IndentHelper.indent(context, ")");
        }
    }

}
