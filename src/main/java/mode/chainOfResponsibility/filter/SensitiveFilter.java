package mode.chainOfResponsibility.filter;

/**
 * @Author ws
 * @Date 2021/5/31 15:04
 */
public class SensitiveFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String reqMessage = request.getMessage();
        reqMessage=reqMessage.replaceAll("sb","ssss").replaceAll("傻逼","sssbbb")+"--》SensitiveFilter";
        request.setMessage(reqMessage);

        // 决定下个过滤器需不需要执行
        filterChain.doFilter(request,response);

        String respMessage = response.getMessage();
        respMessage+="《--SensitiveFilter";
        response.setMessage(respMessage);
    }
}
