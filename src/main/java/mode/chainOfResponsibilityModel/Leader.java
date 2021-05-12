package mode.chainOfResponsibilityModel;

/**
 * @Author ws
 * @Date 2021/5/12 22:14
 * @Version 1.0
 */
public class Leader extends Handler{

    @Override
    public void handleRequest(int request) {
        // leader可以批三天假
        if (request<3){
            System.out.println("领导批假允许");
        }else {
            if (successor!=null){
                // 向上汇报
                successor.handleRequest(request);
            }
        }
    }
}
