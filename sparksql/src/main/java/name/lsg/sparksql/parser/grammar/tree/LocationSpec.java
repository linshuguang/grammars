package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/28.
 */
public class LocationSpec extends AST {
    String loc;

    public LocationSpec(String loc){
        this.loc = loc;
    }

    @Override
    public void indent(Context context){
        IndentHelper.indentKeyWord(context,"LOCATION");
        IndentHelper.indentKeyWord(context,loc);
    }
}
