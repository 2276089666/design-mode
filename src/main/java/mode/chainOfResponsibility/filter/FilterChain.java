package mode.chainOfResponsibility.filter;

/**
 * @Author ws
 * @Date 2021/5/31 14:43
 */
public interface FilterChain {
    void doFilter(Request request, Response response);
}
