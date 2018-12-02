package name.lsg.sparksql.parser.grammar.tree.dml;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
@Data
public class Analyze extends AST {

    AST tableIdentifier;
    AST partitionSpec;
    AST identifier;
    List<AST> identifierSeq;

    public Analyze(AST tableIdentifier){
        this.tableIdentifier = tableIdentifier;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"ANALYZE", "TABLE");
        IndentHelper.indent(context, tableIdentifier);
        IndentHelper.indent(context, partitionSpec);
        IndentHelper.indentKeyWord(context,"COMPUTE", "STATISTICS");
        if(identifier!=null){
            IndentHelper.indent(context, identifier);
        }else if(identifierSeq!=null){
            IndentHelper.indentKeyWord(context,"FOR", "COLUMNS");
            IndentHelper.indent(context, identifierSeq);
        }
    }

}
