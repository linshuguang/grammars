package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class GroupBy extends AST {
    List<AST> groupingExpressions = new ArrayList<>();

    String with;
    List<AST> groupingSet = new ArrayList<>();

    boolean hasGroupSet = false;

    public void addGroupingExpression(AST value){
        this.groupingExpressions.add(value);
    }

    public void markHasGroupSet(){
        hasGroupSet = true;
    }

    public void addGroupingSet(AST set){
        groupingSet.add(set);
    }

    @Override
    public void confess(Context context){
        runConfess(context, "group by");
        runConfess(context, groupingExpressions);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context, "group");
        IndentHelper.indentKeyWord(context, "by");
        IndentHelper.indent(context, groupingExpressions);
        if(!StringUtils.isBlank(with)){
            IndentHelper.indentKeyWord(context, "with");
            IndentHelper.indent(context, with);
        }else if(hasGroupSet){
            IndentHelper.indentKeyWord(context, "GROUPING","sets");
            IndentHelper.indent(context, "(");
            IndentHelper.indent(context, groupingSet);
            IndentHelper.indent(context, ")");
        }

    }

}
