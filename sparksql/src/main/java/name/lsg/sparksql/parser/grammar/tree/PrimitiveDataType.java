package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

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
    public void ident(Context context){
        IdentHelper.ident(context, identifier);
        if(valueList.size()>0){
            IdentHelper.ident(context, "(");
            for(int i = 0; i < valueList.size(); i++){
                IdentHelper.ident(context,valueList.get(i));
                if(i<valueList.size()-1){
                    IdentHelper.ident(context, ",");
                }
            }
            IdentHelper.ident(context, ")");
        }
    }

}
