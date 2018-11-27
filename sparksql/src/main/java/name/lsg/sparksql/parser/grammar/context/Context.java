package name.lsg.sparksql.parser.grammar.context;

import lombok.Data;
import name.lsg.sparksql.parser.grammar.tree.AST;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class Context {
    private static final Logger LOGGER = LoggerFactory.getLogger(Context.class);
    private static final String TAB = "\t";

    List<AST> predicates = new ArrayList<>();

    OutputStream out;

    Map<String,String> tableMap;


    public void outputRaw(String str){
        String lines  = str;
        try {
            out.write(lines.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void output(String str){
        outputRaw(str+TAB);
    }

    public void confess(String line){
        String lines  = line + TAB;
        try {
            out.write(lines.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void indent(String line){
        String lines  = line + TAB;
        try {
            out.write(lines.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getConfess(){
        return out.toString();
    }

    public boolean isTargetOperator(String operator){

        if("=".equals(operator)
                ||">".equals(operator)
                ||"<".equals(operator)
                ||"<=".equals(operator)
                ||">=".equals(operator)
                ||"<>".equals(operator)
                ||"!=".equals(operator)
                ) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isTargetField(String field){
        Pattern pattern = Pattern.compile("\\w+['.']{1}date");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(field);
        if(matcher.find()){
            LOGGER.debug("missed field:{}",field);
            return true;
        }else{
            LOGGER.debug("hitted field:{}",field);
            return false;
        }

    }

    public void addPredicate(AST predicate){
        predicates.add(predicate);
    }

    public void addPredicate(List<AST> predicates){
        this.predicates.addAll(predicates);
    }

    public void confessPredicates(){
        /*
        for(AST predicate : predicates) {
            System.out.println(predicate.confess(););
        }
        */
    }

    public String retrieveTable(String table){
        return tableMap.get(table);
    }
}
