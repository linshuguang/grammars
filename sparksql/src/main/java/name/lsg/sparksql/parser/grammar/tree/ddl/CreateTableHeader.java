package name.lsg.sparksql.parser.grammar.tree.ddl;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class CreateTableHeader extends AST {
    boolean temporary =false;
    boolean external = false;
    boolean notExists = false;
    AST tableIdentifier;
    //CREATE TEMPORARY? EXTERNAL? TABLE (IF NOT EXISTS)? tableIdentifier


    public void markTemporary(){
        temporary = true;
    }

    public void markExternal(){
        external = true;
    }

    public void markNotExists(){
        notExists = true;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "CREATE");
        if(temporary){
            IndentHelper.indentKeyWord(context, "TEMPORARY");
        }
        if(external){
            IndentHelper.indentKeyWord(context, "EXTERNAL");
        }
        IndentHelper.indentKeyWord(context, "TABLE");
        if(notExists){
            IndentHelper.indentKeyWord(context, "IF","NOT", "EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
    }

}
