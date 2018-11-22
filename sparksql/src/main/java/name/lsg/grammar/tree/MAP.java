package name.lsg.grammar.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kenya on 2018/11/21.
 */
public class MAP extends ComplexDataType {

    Map<AST,AST> astMap = new HashMap<>();

    public MAP(AST k, AST v){
        astMap.put(k,v);
    }
}