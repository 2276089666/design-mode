package mode.factory;

import mode.factory.brand.HuaWei;
import mode.factory.brand.IPhone;
import mode.factory.brand.Xiaomi;

/**
 * @Author ws
 * @Date 2021/5/29 18:24
 */
public class Factory {
    public Callable createPhone(String phoneName){
        if ("Huawei".equals(phoneName)){
            return new HuaWei();
        }else if ("IPhone".equals(phoneName)){
            return new IPhone();
        }else if ("Xiaomi".equals(phoneName)){
            return new Xiaomi();
        }else {
            return null;
        }
    }
}
