package mode.bridgeMode.systemType;

import mode.adapterMode.Adapter;
import mode.bridgeMode.ImageImp;
import mode.bridgeMode.Matrix;

public class MacImpl implements ImageImp {

    // 事配器
    Adapter adapter;

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void doPaint(Matrix m) {
        adapter.Request();
        System.out.println("MacImpl"+"Matrix");
    }
}
