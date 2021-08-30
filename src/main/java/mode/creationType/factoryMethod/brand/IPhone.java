package mode.creationType.factoryMethod.brand;

import mode.creationType.factoryMethod.Callable;

/**
 * @Author ws
 * @Date 2021/5/29 18:22
 */
public class IPhone implements Callable {
    @Override
    public String brand() {
        return "苹果手机";
    }
}
