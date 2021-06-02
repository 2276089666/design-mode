package mode.chainOfResponsibility.filter;


/**
 * @Author ws
 * @Date 2021/5/31 14:30
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
