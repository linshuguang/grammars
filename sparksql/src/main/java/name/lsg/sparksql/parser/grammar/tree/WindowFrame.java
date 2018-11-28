package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class WindowFrame extends AST {
    String frameType;
    AST start;
    AST end;

    public WindowFrame(String frameType, AST start){
        this.frameType = frameType;
        this.start = start;
        this.end = null;
    }

    public WindowFrame(String frameType, AST start, AST end){
        this.frameType = frameType;
        this.start = start;
        this.end = end;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, IndentHelper.keyword(frameType));
        if(end==null){
            IndentHelper.indent(context, start);
        }else{
            IndentHelper.indent(context, IndentHelper.keyword("between"));
            IndentHelper.indent(context, start);
            IndentHelper.indent(context, IndentHelper.keyword("and"));
            IndentHelper.indent(context, end);
        }
    }

}
