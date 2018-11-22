package name.lsg.sparksql.parser.grammar.context;

import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/**
 * Created by kenya on 2018/11/13.
 */
@Service
public class ContextFactory {

    public static Context create(ContextParam param){
        Context context = new Context();
        context.setOut(param.getOut());
        return context;
    }

    public static Context create(){
        ContextParam param = createParam();
        Context context = new Context();
        context.setOut(param.getOut());
        return context;
    }

    public static ContextParam createParam(){
        OutputStream bOut = new ByteArrayOutputStream();
        ContextParam param = new ContextParam();
        param.setOut(bOut);
        return param;
    }
}
