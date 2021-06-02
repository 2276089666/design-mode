package mode.bridge.systemType;

import mode.bridge.ImageImp;
import mode.bridge.Matrix;

public class MacImpl implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Mac doPaint:\t"+m.getShape());
    }
}
