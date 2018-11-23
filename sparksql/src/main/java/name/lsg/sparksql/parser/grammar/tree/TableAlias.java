package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

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
    public void ident(Context context){

        if(AS){
            IdentHelper.ident(context, IdentHelper.keyword("as"));
        }
        IdentHelper.ident(context, strictIdentifier);
        IdentHelper.identWithDelimeter(context, identifierList," ");
    }

}
