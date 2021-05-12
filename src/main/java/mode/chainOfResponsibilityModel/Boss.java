package mode.chainOfResponsibilityModel;

/**
 * @Author ws
 * @Date 2021/5/12 22:19
 * @Version 1.0
 */
public class Boss extends Handler{
    @Override
    public void handleRequest(int request) {
        // boss可以批7天假
        if (request>=3) {
            System.out.println("boss批假允许");
        }
    }
}
