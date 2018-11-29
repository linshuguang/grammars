package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class CreateFunction extends AST {
    boolean replace = false;
    boolean temporary = false;
    boolean notExists = false;
    AST qualifiedName;
    String className;
    List<AST> resources = new ArrayList<>();

    public CreateFunction(boolean replace,boolean temporary,boolean notExists,AST qualifiedName,String className){
        this.replace = replace;
        this.temporary = temporary;
        this.notExists = notExists;
        this.qualifiedName = qualifiedName;
        this.className = className;
    }

    public void addResource(AST resource){
        resources.add(resource);
    }

    @Override
    public void indent(Context context) {
        IndentHelper.indentKeyWord(context, "CREATE");
        if (replace) {
            IndentHelper.indentKeyWord(context, "OR", "REPLACE");
        }
        if (temporary) {
            IndentHelper.indentKeyWord(context, "TEMPORARY");
        }
        IndentHelper.indentKeyWord(context, "FUNCTION");
        if (notExists) {
            IndentHelper.indentKeyWord(context, "IF", "NOT", "EXISTS");
        }
        IndentHelper.indent(context, qualifiedName);
        IndentHelper.indentKeyWord(context, "AS");
        IndentHelper.indent(context, className);
        if (resources.size() > 0) {
            IndentHelper.indentKeyWord(context, "USING");
            IndentHelper.indent(context, resources);
        }
    }
}
