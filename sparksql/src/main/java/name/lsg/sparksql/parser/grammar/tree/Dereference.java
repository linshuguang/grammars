package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/13.
 */
public class Dereference extends TargetAST {
    AST base;
    AST field;

    public Dereference(AST base, AST field){
        this.base = base;
        this.field = field;
    }

    @Override
    protected boolean isTargetField(Context context){
        String msg = getRawContent(base) + "." +getRawContent(field);
        return context.isTargetField(msg);
    }

    @Override
    public void confess(Context context){

        String msg = getRawContent(base) + "." +getRawContent(field);
        runConfess(context, msg);
    }

    @Override
    public void indent(Context context){

        String msg = getRawContent(base) + "." +getRawContent(field);
        IndentHelper.indent(context, msg);
    }

    @Override
    public DATE toDate(){
        String msg = getRawContent(base);
        return new DATE(msg);
    }

    @Override
    public DATE evalDate(Context context){

        String msg = getRawContent(base);
        String realmsg = context.retrieveTable(msg);
        if(realmsg != null) {
            return new DATE(realmsg);
        }else{
            return null;
        }
    }

}
