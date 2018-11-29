package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class SubQuery extends ParenthesisAST {

    public SubQuery(AST queryNoWith){
        super(queryNoWith);
    }


    @Override
    public void indent(Context context){
        super.indent(context);
    }

}