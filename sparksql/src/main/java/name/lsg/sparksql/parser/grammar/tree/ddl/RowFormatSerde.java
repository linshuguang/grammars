package name.lsg.sparksql.parser.grammar.tree.ddl;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */
@Data
public class RowFormatSerde extends AST {
    String name;
    AST props;

    public RowFormatSerde(String name){
        this.name = name;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"ROW", "FORMAT", "SERDE");
        IndentHelper.indent(context, name);
        if(props!=null){
            IndentHelper.indentKeyWord(context,"WITH", "SERDEPROPERTIES");
            IndentHelper.indent(context, props);
        }
    }
}
