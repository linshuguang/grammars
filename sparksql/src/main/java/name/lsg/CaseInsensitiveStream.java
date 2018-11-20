package name.lsg;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;

public class CaseInsensitiveStream
        extends ANTLRInputStream
{

    public CaseInsensitiveStream(String input) {
        super(input);
    }

    @Override
    public String getText(@NotNull Interval interval){
        int start = interval.a;
        int stop = interval.b;
        if(stop >= this.n) {
            stop = this.n - 1;
        }

        int count = stop - start + 1;
        return start >= this.n?"":new String(this.data, start, count).toUpperCase();
    }


}
