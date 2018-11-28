package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/28.
 */
@Data
public class WindowSpec extends AST {
    AST name;
    List<AST> partitions = new ArrayList<>();
    String partionMethod;
    List<AST> sortItems = new ArrayList<>();
    String sortMethod;
    AST windowFrame;

    public WindowSpec(){
        name = null;
    }

    public WindowSpec(AST name){
        this.name = name;
    }

    public WindowSpec(String  partionMethod){
        this.partionMethod = partionMethod;
    }

    public void addSortItem(AST item){
        this.sortItems.add(item);
    }

    public void addPartition(AST partition){
        this.partitions.add(partition);
    }


    @Override
    public void indent(Context context){
        if(name!=null){
            IndentHelper.indent(context, name);
        }else{
            IndentHelper.indent(context, "(");

            if(StringUtils.equalsIgnoreCase("CLUSTER",partionMethod)){
                IndentHelper.indent(context, IndentHelper.keyword("CLUSTER"));
                IndentHelper.indent(context, IndentHelper.keyword("BY"));
                IndentHelper.indent(context, partitions);
            }else if(StringUtils.equalsIgnoreCase("PARTITION",partionMethod) || StringUtils.equalsIgnoreCase("DISTRIBUTE",partionMethod)){
                IndentHelper.indent(context, IndentHelper.keyword(partionMethod));
                IndentHelper.indent(context, IndentHelper.keyword("BY"));
                IndentHelper.indent(context, partitions);
            }
            if(!StringUtils.isBlank(sortMethod)){
                IndentHelper.indent(context, IndentHelper.keyword(sortMethod));
                IndentHelper.indent(context, IndentHelper.keyword("BY"));
                IndentHelper.indent(context, sortItems);
            }

            IndentHelper.indent(context, windowFrame);
            IndentHelper.indent(context, ")");
        }

    }





}
