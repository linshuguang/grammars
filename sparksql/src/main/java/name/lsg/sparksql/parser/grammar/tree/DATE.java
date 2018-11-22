package name.lsg.sparksql.parser.grammar.tree;

import name.lsg.sparksql.parser.grammar.context.Context;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kenya on 2018/11/13.
 */
public class DATE extends AST {

    Date date = null;

    public DATE(String dateStr){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateStr = dateStr.replaceAll("^'*","");
            dateStr = dateStr.replaceAll("[']*$","");
            this.date = format.parse(dateStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public AST eval(Context context){
        return this;
    }

    @Override
    public DATE toDate(){
        return this;
    }

    @Override
    public BoolValue eq(AST ast){
        DATE a = ast.toDate();
        return new BoolValue(this.date.compareTo(a.date)==0);
    }

    @Override
    public BoolValue neq(AST ast){
        DATE a = ast.toDate();
        return new BoolValue(this.date.compareTo(a.date)!=0);
    }

    @Override
    public BoolValue gt(AST ast){
        DATE a = ast.toDate();
        return new BoolValue(this.date.compareTo(a.date)>0);
    }

    @Override
    public BoolValue gte(AST ast){
        DATE a = ast.toDate();
        return new BoolValue(this.date.compareTo(a.date)>=0);
    }

    @Override
    public BoolValue lt(AST ast){
        DATE a = ast.toDate();
        return new BoolValue(this.date.compareTo(a.date)<0);
    }

    @Override
    public BoolValue lte(AST ast){
        DATE a = ast.toDate();
        return new BoolValue(this.date.compareTo(a.date)<=0);
    }





}
