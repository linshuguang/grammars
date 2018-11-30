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
public class CreateHiveTable extends AST {
    AST createTableHeader;
    List<AST> columns;
    String comment;
    List<AST> partitionColumns;
    AST bucketSpec;
    AST skewSpec;
    AST rowFormat;
    AST createFileFormat;
    AST locationSpec;
    AST tableProps;
    boolean as = false;
    AST query;
    /*
            ((COMMENT comment=STRING) |
            (PARTITIONED BY '(' partitionColumns=colTypeList ')') |
    bucketSpec |
    skewSpec |
    rowFormat |
    createFileFormat |
    locationSpec |
            (TBLPROPERTIES tableProps=tablePropertyList))*
            (AS? query)?
    */

    public void markAS(){
        as= true;
    }

    public CreateHiveTable(AST createTableHeader){
        this.createTableHeader = createTableHeader ;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context, createTableHeader);
        if(columns!=null){
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, columns);
            IndentHelper.indent(context, ")");
        }
        if(comment!=null){
            IndentHelper.indentKeyWord(context, "comment");
            IndentHelper.indent(context, comment);
        }
        if(partitionColumns!=null){
            IndentHelper.indentKeyWord(context, "PARTITIONED", "BY");
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, partitionColumns);
            IndentHelper.indent(context, ")");
        }
        if(bucketSpec!=null){
            IndentHelper.indent(context, bucketSpec);
        }
        if(skewSpec!=null){
            IndentHelper.indent(context, skewSpec);
        }
        if(rowFormat!=null){
            IndentHelper.indent(context, rowFormat);
        }
        if(createFileFormat!=null){
            IndentHelper.indent(context, createFileFormat);
        }
        if(locationSpec!=null){
            IndentHelper.indent(context, locationSpec);
        }
        if(tableProps!=null){
            IndentHelper.indentKeyWord(context, "TBLPROPERTIES");
            IndentHelper.indent(context, tableProps);
        }

        if(query!=null){
            if(as){
                IndentHelper.indentKeyWord(context, "as");
            }
            IndentHelper.indent(context, query);
        }

    }

}
