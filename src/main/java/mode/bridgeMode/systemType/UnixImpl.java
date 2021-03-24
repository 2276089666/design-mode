package mode.bridgeMode.systemType;

import mode.bridgeMode.ImageImp;
import mode.bridgeMode.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 21:19
 * @Version 1.0
 */
public class UnixImpl implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("UnixImpl"+"Matrix");
    }
}
