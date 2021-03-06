package name.lsg.sparksql.parser.grammar.tree.ddl;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.grammar.tree.TablePropertyList;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class CreateDatabase extends AST{
    boolean notExists;
    AST identifier;
    String comment;
    AST locationSpec;
    AST tablePropertyList;

    public CreateDatabase(boolean notExists,AST identifier){
        this.notExists = notExists;
        this.identifier = identifier;
    }

    @Override
    public void indent(Context context){
        //CREATE DATABASE (IF NOT EXISTS {notExists=true;})? identifier
          //      (COMMENT comment=STRING)? locationSpec

        IndentHelper.indentKeyWord(context, "CREATE", "DATABASE");
        if(notExists){
            IndentHelper.indentKeyWord(context, "IF", "NOT", "EXISTS");
        }
        IndentHelper.indent(context, identifier);
        if(comment!=null){
            IndentHelper.indentKeyWord(context, "COMMENT");
            IndentHelper.indent(context, comment);
        }

        IndentHelper.indent(context, locationSpec);

        if(tablePropertyList!=null){
            IndentHelper.indentKeyWord(context, "WITH","DBPROPERTIES");
            IndentHelper.indent(context, tablePropertyList);
        }


    }

}
