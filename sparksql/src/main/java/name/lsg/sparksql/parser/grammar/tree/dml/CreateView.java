package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/29.
 */
public class CreateView extends AST {
    boolean replace =false;
    boolean global = false;
    boolean temporary = false;
    boolean notExists = false;
    AST tableIdentifier;
    AST identifierCommentList;
    String comment;
    AST identifierList;
    AST tablePropertyList;
    AST query;
    public CreateView(boolean replace,boolean global,boolean temporary,boolean notExists,AST tableIdentifier,AST identifierCommentList,String comment,AST identifierList,AST tablePropertyList,AST query){
        this.replace = replace;
        this.global = global;
        this.temporary = temporary;
        this.notExists = notExists;
        this.tableIdentifier = tableIdentifier;
        this.identifierCommentList = identifierCommentList;
        this.comment = comment;
        this.identifierList = identifierList;
        this.tablePropertyList = tablePropertyList;
        this.query = query;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "CREATE");
        if(replace) {
            IndentHelper.indentKeyWord(context, "OR","REPLACE");
        }
        if(temporary){
            if(global){
                IndentHelper.indentKeyWord(context, "GLOBAL");
            }
            IndentHelper.indentKeyWord(context, "TEMPORARY");
        }
        IndentHelper.indentKeyWord(context, "VIEW");

        if(notExists){
            IndentHelper.indentKeyWord(context, "IF", "NOT","EXISTS");
        }
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, identifierCommentList);
        if(comment!=null){
            IndentHelper.indentKeyWord(context, "COMMENT");
            IndentHelper.indent(context, comment);
        }
        if(identifierList!=null){
            IndentHelper.indentKeyWord(context, "PARTITIONED", "ON");
            IndentHelper.indent(context, identifierList);
        }

        if(tablePropertyList!=null){
            IndentHelper.indentKeyWord(context, "TBLPROPERTIES");
            IndentHelper.indent(context, tablePropertyList);
        }
        IndentHelper.indentKeyWord(context, "AS");
        IndentHelper.indent(context, query);

    }

}
