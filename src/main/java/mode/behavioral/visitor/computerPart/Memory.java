package mode.behavioral.visitor.computerPart;

import mode.behavioral.visitor.ComputerPart;
import mode.behavioral.visitor.Visitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:01
 */
public class Memory extends ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return 1000.00;
    }
}
