package mode.appearanceMode;

import mode.appearanceMode.module.*;

/**
 * @Author ws
 * @Date 2021/5/6 20:06
 * @Version 1.0
 */
public class ConcreteFacade1 extends Facade {
    private System1 system1 = null;
    private System2 system2 = null;
    private System3 system3 = null;
    private System4 system4 = null;
    private System5 system5 = null;

    @Override
    public void method1() {
        system1 = new System1();
        system2 = new System2();
        system5 = new System5();
        system1.m();
        system2.m();
        system5.m();
    }

    @Override
    public void method2() {
        system3 = new System3();
        system4 = new System4();
        system3.m();
        system4.m();
    }
}
