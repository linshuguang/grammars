package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.util.IndentHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/11/29.
 */
public class IdentifierCommentList extends AST {
    List<AST> comments = new ArrayList<>();

    public void addComment(AST comment){
        this.comments.add(comment);
    }

    @Override
    public void indent(Context context){
        IndentHelper.indent(context,"(");
        IndentHelper.indent(context, comments);
        IndentHelper.indent(context,")");
    }
}
