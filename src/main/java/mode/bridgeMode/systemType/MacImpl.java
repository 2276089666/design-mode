package mode.bridgeMode.systemType;

import mode.bridgeMode.ImageImp;
import mode.bridgeMode.Matrix;

public class MacImpl implements ImageImp {

    @Override
    public void doPaint(Matrix m) {
        System.out.println("MacImpl"+"Matrix");
    }
}
