package mode.visitor.computerPart;

import mode.visitor.ComputerPart;
import mode.visitor.Visitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:02
 */
public class Monitor extends ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visitMonitor(this);
    }

    @Override
    public double getPrice() {
        return 1200.00;
    }
}
