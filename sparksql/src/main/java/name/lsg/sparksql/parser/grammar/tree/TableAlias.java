package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class TableAlias extends AST {
    AST strictIdentifier;
    List<AST> identifierList;
    boolean AS =false;

    public TableAlias(){

    }

    public TableAlias(AST strictIdentifier){
        this.strictIdentifier = strictIdentifier;
    }

    @Override
    public void indent(Context context){

        if(AS){
            IndentHelper.indent(context, IndentHelper.keyword("as"));
        }
        IndentHelper.indent(context, strictIdentifier);
        IndentHelper.indentWithDelimeter(context, identifierList," ");
    }

}
