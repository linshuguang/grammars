package name.lsg.sparksql.parser;

import name.lsg.CaseInsensitiveStream;
import name.lsg.sparksql.parser.grammar.tree.AST;
import org.antlr.v4.runtime.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import org.apache.spark.sql.catalyst.parser.SqlBaseParser;

import java.util.ArrayList;
import java.util.List;


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

    public List<AST> parseStatements(String code){
        /*
        SqlBaseParser parser = getParser(code);

        //SqlBaseParser.MultipleStatementsContext context = parser.multipleStatements();
        return context.value;
        */
        List<AST> astList = new ArrayList<>();
        CharStream input = new ANTLRInputStream(code);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //tokens.getNumberOfOnChannelTokens();
        //System.out.println(tokens.size());
        while(true) {
            SqlBaseParser parser = new SqlBaseParser(tokens);
            SqlBaseParser.SingleStatementContext context = parser.singleStatement();

            astList.add(context.value);
            if(lexer._token.getType()==Token.EOF) {
                break;
            }
        }
        return astList;
    }

    public AST parse(String code){
        return parseStatement(code);
    }



    private boolean invalidToken(Token token){

        return token.getChannel()==1 || (token.getType() != Token.EOF && (StringUtils.isBlank(token.getText()) || token.getType()==SqlBaseLexer.WS || StringUtils.equals(token.getText(),";")));
    }
    private Token nextValid(SqlBaseLexer lexer){
        Token token = lexer.nextToken();
        while(invalidToken(token)){
            token = lexer.nextToken();
        }
        return token;
    }
    public boolean identSQL(String sql1, String sql2){

        SqlBaseLexer lexer1 = getLexer(sql1, false);
        SqlBaseLexer lexer2 = getLexer(sql2, false);

        StringBuilder sbuf  = new StringBuilder();
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
                System.out.println("===================================================");
                System.out.println("token1:" + token1.toString());
                System.out.println("token2:" + token2.toString());
                System.out.println("\n\nhistory:"+sbuf.toString());
                System.out.println("===================================================\n\n\n\n");

                break;
            }
            sbuf.append(token1.toString());
            sbuf.append("\n");
        }

        return yes;
    }

}
