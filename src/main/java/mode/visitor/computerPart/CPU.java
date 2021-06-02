package mode.visitor.computerPart;

import mode.visitor.ComputerPart;
import mode.visitor.Visitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:01
 */
public class CPU extends ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    public double getPrice() {
        return 2000.00;
    }
}
