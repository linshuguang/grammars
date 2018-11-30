package name.lsg.sparksql.parser;

import name.lsg.CaseInsensitiveStream;
import name.lsg.sparksql.parser.grammar.tree.AST;
import org.antlr.v4.runtime.*;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import org.apache.spark.sql.catalyst.parser.SqlBaseParser;
import org.springframework.util.StringUtils;


/**
 * Created by kenya on 2018/11/13.
 */
public class Parser {


    private SqlBaseLexer getLexer(String inputString, boolean sensitive) {

        CharStream input;
        if(!sensitive){
            input = new ANTLRInputStream(inputString);
        }else{
            input = new CaseInsensitiveStream(inputString);
        }

        SqlBaseLexer lexer = new SqlBaseLexer(input);
        return lexer;
    }


    private TokenStream getTokens(String inputString, boolean sensitive) {
        SqlBaseLexer lexer = getLexer(inputString, sensitive);
        TokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    private SqlBaseParser getParser(String code){
        TokenStream tokens = getTokens(code,false);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        return parser;
    }

    private AST parseStatement(String code){
        SqlBaseParser parser = getParser(code);
        SqlBaseParser.StatementContext context = parser.statement();
        return context.value;
    }

    public AST parse(String code){
        return parseStatement(code);
    }

    private Token nextValid(SqlBaseLexer lexer){
        Token token = lexer.nextToken();
        while(token.getType() != Token.EOF && token.getType()==SqlBaseLexer.WS){
            token = lexer.nextToken();
        }
        return token;
    }
    public boolean identSQL(String sql1, String sql2){

        SqlBaseLexer lexer1 = getLexer(sql1, false);
        SqlBaseLexer lexer2 = getLexer(sql2, false);

        boolean yes = true;
        for (Token token2 = nextValid(lexer2);
             token2.getType() != Token.EOF;
             token2 = nextValid(lexer2))
        {
            Token token1 = nextValid(lexer1);
            if(yes && token1.getType()!=token2.getType()){
                System.out.println("token type not equal");
                yes = false;
            }
            if(yes && !StringUtils.endsWithIgnoreCase(token1.getText(),token2.getText())){
                System.out.println("token text not equal");
                yes = false;
            }
            if(!yes) {
                System.out.println("token1:" + token1.toString());
                System.out.println("token2:" + token2.toString());
                System.out.println("\n\n\n\n");
            }

        }

        return yes;
    }

}
