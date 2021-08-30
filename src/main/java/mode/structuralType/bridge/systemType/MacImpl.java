package mode.structuralType.bridge.systemType;

import mode.structuralType.bridge.ImageImp;
import mode.structuralType.bridge.Matrix;

public class MacImpl implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("Mac doPaint:\t"+m.getShape());
    }
}
