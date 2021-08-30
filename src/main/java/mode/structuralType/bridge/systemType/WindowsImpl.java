package mode.structuralType.bridge.systemType;

import mode.structuralType.bridge.ImageImp;
import mode.structuralType.bridge.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 21:10
 * @Version 1.0
 */
public class WindowsImpl implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Windows doPaint:\t"+m.getShape());
    }
}
