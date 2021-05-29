package mode.factoryMode.brand;

import mode.factoryMode.Callable;

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
