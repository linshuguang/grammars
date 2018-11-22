package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.util.IdentHelper;

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

        IdentHelper.ident(context, strictIdentifier);
        if(AS){
            IdentHelper.ident(context, IdentHelper.keyword("as"));
        }
        IdentHelper.identWithDelimeter(context, identifierList," ");
    }

}
