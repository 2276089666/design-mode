package mode.facade;

import mode.facade.module.System1;
import mode.facade.module.System2;
import mode.facade.module.System3;
import mode.facade.module.System4;

/**
 * @Author ws
 * @Date 2021/5/6 20:07
 * @Version 1.0
 */
public class ConcreteFacade2 extends Facade {
    private System1 system1 = null;
    private System2 system2 = null;
    private System3 system3 = null;
    private System4 system4 = null;

    @Override
    public void method1() {
        system1 = new System1();
        system2 = new System2();
        system1.m();
        system2.m();
    }

    @Override
    public void method2() {
        system3 = new System3();
        system4 = new System4();
        system1=new System1();
        system3.m();
        system4.m();
        system1.m();
    }
}
