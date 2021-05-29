package mode.templateMode;

/**
 * @Author ws
 * @Date 2021/5/27 11:04
 */
public abstract class AbstractTemplate {
    public void templateMethod() {
        checkNumber();  // 抽号
        queueUp();      // 排队
        handleBusiness();  // 业务办理
        serviceEvaluation();  // 服务评价
    }

    protected void checkNumber() {
        System.out.println("checkNumber ...");
    }

    protected void queueUp() {
        System.out.println("queueUp ...");
    }

    protected abstract void handleBusiness();

    protected void serviceEvaluation() {
        System.out.println("service evaluation ...");
    }
}
