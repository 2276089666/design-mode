package mode.chainOfResponsibility.filter;

/**
 * @Author ws
 * @Date 2021/5/31 15:14
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        request.setMessage("请求访问：<script>rm -rf</script> 我猜你是sb,是个大傻逼");
        Response response = new Response();
        response.setMessage("德玛西亚");

        SensitiveFilter sensitiveFilter = new SensitiveFilter();
        HtmlFilter htmlFilter = new HtmlFilter();
        WebFilterChain webFilterChain = new WebFilterChain();
        webFilterChain.add(sensitiveFilter);
        webFilterChain.add(htmlFilter);


        webFilterChain.doFilter(request,response);
        System.out.println(request.getMessage());
        System.out.println(response.getMessage());
    }
}
