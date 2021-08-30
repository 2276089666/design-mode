package mode.behavioral.chainOfResponsibility.filter;

/**
 * @Author ws
 * @Date 2021/5/31 14:53
 */
public class HtmlFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String reqMessage = request.getMessage();
        reqMessage=reqMessage.replaceAll("<","[").replaceAll(">","]")+"--》htmlFilter";
        request.setMessage(reqMessage);

        // 决定下个过滤器需不需要执行
        filterChain.doFilter(request,response);

        String respMessage = response.getMessage();
        respMessage+="《--htmlFilter";
        response.setMessage(respMessage);
    }
}
