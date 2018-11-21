package name.lsg.grammar.tree;

import lombok.Data;
import name.lsg.grammar.context.Context;
import name.lsg.grammar.context.ContextFactory;
import name.lsg.util.MagicUtils;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.List;
/**
 * Created by kenya on 2018/11/13.
 */
@Data
public class AST {
    private static final String DEFAULT_DELIMETER = ",";

    private static final String MAGIC_OUTPUT = "output";
    private static final String MAGIC_IDENT = "ident";

    public Object invokeMethod(String methodName, Object target, Object... args) {
        return MagicUtils.invokeMethod(methodName,target,args);
    }

    public void confess( Context context){
        throw new RuntimeException("ident not implement");
    }

    protected void runConfess(Context context, AST ast){
        if(ast!=null){
            ast.confess(context);
        }
    }

    protected void runConfess(Context context, String msg){
        if(msg!=null) {
            context.confess(msg);
        }
    }

    protected void runConfess(Context context, List<AST> astList){
        if(astList==null || astList.size()==0){
            return;
        }
        runConfess(context, astList, DEFAULT_DELIMETER);
    }

    protected void runConfess(Context context, List<AST> astList, String delimeter){
        if(astList!=null && astList.size()>0){
            for(int i = 0; i < astList.size(); i++ ){
                AST ast = astList.get(i);
                runConfess(context, ast);
                if( i < astList.size()-1){
                    context.confess(delimeter);
                }
            }
        }
    }


    protected Object output(Context context, String msg){
        Object result = null;
        if(!StringUtils.isEmpty(msg)) {
            result = invokeMethod(MAGIC_OUTPUT, context, msg);
        }
        return result;
    }

    /*
    protected void runIdent(Context context, String msg){

        output(context, msg);
    }
    */


    public void ident(Context context){
        throw new RuntimeException("ident not implement");
    }



    protected boolean isTargetAST(Context context){
        return false;
    }

    protected boolean isTargetField(Context context){
        return false;
    }

    protected String getRawContent(AST ast){
        Context context = ContextFactory.create();
        runConfess(context,ast);
        return context.getConfess().trim();
    }

    protected BoolValue eq(AST ast){
        if(this==ast){
            return new BoolValue(true);
        }
        return null;
    }

    protected BoolValue gt(AST ast){
        return null;
    }
    protected BoolValue gte(AST ast){
        return null;
    }
    protected BoolValue lt(AST ast){
        return null;
    }
    protected BoolValue lte(AST ast){
        return null;
    }
    protected BoolValue neq(AST ast){
        return null;
    }
    protected BoolValue neqj(AST ast){
        return null;
    }
    protected BoolValue nseq(AST ast){
        return null;
    }

    protected DATE toDate(){
        return null;
    }

    protected boolean toBoolean(){
        return false;
    }

    protected DATE evalDate(Context context){
        return null;
    }

    public AST eval(Context context){
        throw new RuntimeException("ident not implement");
        //return this;
    }

    public AST steam(Context context){
        return null;
    }

    public String confessPredicator(Context context){
        return null;
    }

}
