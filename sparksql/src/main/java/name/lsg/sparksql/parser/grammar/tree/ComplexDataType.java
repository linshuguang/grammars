package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/21.
 */
@Data
public class ComplexDataType extends DataType {
    List<AST> complexColTypeList;
    String neq;

    @Override
    public void indent(Context context){
        if(neq==null){
            IndentHelper.indentKeyWord(context,"struct");
            IndentHelper.indent(context,"<");
            IndentHelper.indent(context,complexColTypeList);
            IndentHelper.indent(context,">");
        }else{
            IndentHelper.indentKeyWord(context,neq);
        }
    }

}
