package mode.creationType.factoryMethod.brand;

import mode.creationType.factoryMethod.Callable;

/**
 * @Author ws
 * @Date 2021/5/29 18:24
 */
public class Xiaomi implements Callable {
    @Override
    public String brand() {
        return "小米手机";
    }
}
