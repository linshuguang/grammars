package name.lsg.grammar.tree;

import lombok.Data;

import java.util.List;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class TableAlias extends AST {
    AST strictIdentifier;
    List<AST> identifierList;

    public TableAlias(AST strictIdentifier){
        this.strictIdentifier = strictIdentifier;
    }
}
