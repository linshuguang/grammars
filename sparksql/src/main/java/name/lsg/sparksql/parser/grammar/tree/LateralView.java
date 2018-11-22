package name.lsg.sparksql.parser.grammar.tree;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class LateralView extends AST {
    boolean outer=false;
    AST functionName;
    List<AST> expressionList = new ArrayList<>();
    AST tableName;
    List<AST> asColumns = new ArrayList<>();

    public void addExpression(AST value){
        this.expressionList.add(value);
    }

    public void addAsColumn(AST value){
        this.asColumns.add(value);
    }


}