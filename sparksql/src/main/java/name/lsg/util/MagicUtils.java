package name.lsg.util;

import name.lsg.grammar.context.Context;
import name.lsg.grammar.tree.AST;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by kenya on 2018/11/19.
 */
public class MagicUtils {

    public static int findIntValue(Class<?>cls, String fieldName) throws Exception{
        Field field = ReflectionUtils.findField(cls, fieldName);
        return field.getInt(null);
    }


    public static Object invokeMethod(String methodName, Object target, Object... args) {
        Method method;
        if(args.length==0){
            method = ReflectionUtils.findMethod(target.getClass(),methodName);
        }else {
            Class<?>[] cls = new Class<?>[args.length];
            int i = 0;
            for(Object arg:args){
                cls[i++] = arg.getClass();
            }
            method = ReflectionUtils.findMethod(target.getClass(), methodName, cls);
        }
        return ReflectionUtils.invokeMethod(method,target,args);
    }

    public  static Object call(AST ast, String method, Context context){
        if(ast!=null){
            return invokeMethod(method, ast, context);
        }
        return null;
    }



}
