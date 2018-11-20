package name.lsg;

import name.lsg.grammar.tree.AST;
import org.antlr.v4.runtime.*;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import org.apache.spark.sql.catalyst.parser.SqlBaseParser;


/**
 * Created by kenya on 2018/11/13.
 */
public class Parser {


    private TokenStream getTokens(String inputString, boolean sensitive) {

        CharStream input;
        if(!sensitive){
            input = new ANTLRInputStream(inputString);
        }else{
            input = new CaseInsensitiveStream(inputString);
        }

        SqlBaseLexer lexer = new SqlBaseLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    private AST parseSelect(String code){
        TokenStream tokens = getTokens(code,false);

        SqlBaseParser parser = new SqlBaseParser(tokens);

        SqlBaseParser.StatementContext context = parser.statement();
        //SqlBaseParser.SingleStatementContext context = parser.singleStatement();
        //SqlBaseParser.QuerySpecificationContext context = parser.querySpecification();
        //SqlBaseParser.QuerySpecificationContext context = parser.querySpecification();
        return context.value;
    }

    public AST parse(String code){
        return parseSelect(code);
    }

}
