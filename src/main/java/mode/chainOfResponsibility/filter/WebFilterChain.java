package mode.chainOfResponsibility.filter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author ws
 * @Date 2021/5/31 15:10
 */
public class WebFilterChain implements FilterChain {
    List<Filter> list=new ArrayList();
    int pos=0;
    public void add(Filter filter) {
        list.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (list.size()==pos){
           return;
        }
        Filter filter = list.get(pos);
        pos++;
        filter.doFilter(request,response,this);
    }
}
