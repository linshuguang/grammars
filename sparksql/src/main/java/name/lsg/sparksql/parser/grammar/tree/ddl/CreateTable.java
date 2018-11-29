package name.lsg.sparksql.parser.grammar.tree.ddl;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class CreateTable extends AST{
    AST createTableHeader;
    List<AST>  colTypeList;
    AST tableProvider;
    AST tablePropertyList;
    AST partitionColumnNames;
    AST bucketSpec;
    AST locationSpec;
    String comment;
    AST tableProps;
    boolean as =false;
    AST query;

    public CreateTable(AST createTableHeader, List<AST> colTypeList, AST tableProvider){
        this.createTableHeader = createTableHeader;
        this.colTypeList = colTypeList;
        this.tableProvider = tableProvider;
    }
    /*
     ('(' colTypeList ')')? tableProvider
            ((OPTIONS options=tablePropertyList) |
            (PARTITIONED BY partitionColumnNames=identifierList) |
    bucketSpec |
    locationSpec |
            (COMMENT comment=STRING) |
            (TBLPROPERTIES tableProps=tablePropertyList))*
            (AS? query)?
    */
    public void markAS(){
        as = true;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, createTableHeader);
        if(colTypeList!=null){
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, colTypeList);
            IndentHelper.indent(context, ")");
        }
        IndentHelper.indent(context, tableProvider);

        if(tablePropertyList!=null){
            IndentHelper.indentKeyWord(context, "OPTIONS");
            IndentHelper.indent(context, tablePropertyList);
        }else if(partitionColumnNames!=null){
            IndentHelper.indentKeyWord(context, "PARTITIONED","BY");
            IndentHelper.indent(context, partitionColumnNames);
        }else if(bucketSpec!=null){
            IndentHelper.indent(context, bucketSpec);
        }else if(locationSpec!=null){
            IndentHelper.indent(context, locationSpec);
        }else if(comment!=null){
            IndentHelper.indentKeyWord(context, "comment");
            IndentHelper.indent(context, comment);
        }else if(tablePropertyList!=null){
            IndentHelper.indentKeyWord(context, "TBLPROPERTIES");
            IndentHelper.indent(context, tablePropertyList);
        }
        if(query!=null){
            if(as){
                IndentHelper.indentKeyWord(context, "as");
            }
            IndentHelper.indent(context, query);
        }

    }
}
