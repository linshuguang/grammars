package name.lsg.grammar.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/21.
 */
public class ARRAY extends ComplexDataType {
    List<AST> astList = new ArrayList<>();

    public ARRAY(AST ast){
        astList.add(ast);
    }

}
