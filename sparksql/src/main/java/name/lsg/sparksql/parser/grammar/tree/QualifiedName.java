package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IdentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
public class QualifiedName extends AST {
    List<AST> identifierList = new ArrayList<>();

    public void addIdentifier(AST value){
        this.identifierList.add(value);
    }

    @Override
    public void confess(Context context){
        if(identifierList.size() >= 1){
            StringBuffer sBuf = new StringBuffer();
            sBuf.append(getRawContent(identifierList.get(0)));
            for(int i = 1; i < identifierList.size(); i++){
                sBuf.append(".");
                sBuf.append(identifierList.get(i));
            }
            runConfess(context, sBuf.toString());
        }
    }

    @Override
    public void ident(Context context){
        if(identifierList.size() >= 1){
            StringBuffer sBuf = new StringBuffer();
            sBuf.append(getRawContent(identifierList.get(0)));
            for(int i = 1; i < identifierList.size(); i++){
                sBuf.append(".");
                sBuf.append(identifierList.get(i));
            }
            IdentHelper.ident(context, sBuf.toString());
        }
    }


}