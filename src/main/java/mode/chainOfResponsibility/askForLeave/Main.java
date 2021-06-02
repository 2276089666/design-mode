package mode.chainOfResponsibility.askForLeave;

/**
 * @Author ws
 * @Date 2021/5/12 22:22
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Leader leader = new Leader();
        // 设置上级
        leader.setSuccessor(new Boss());
        leader.handleRequest(5);
    }
}
