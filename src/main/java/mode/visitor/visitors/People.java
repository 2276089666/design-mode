package mode.visitor.visitors;

import mode.visitor.Visitor;
import mode.visitor.computerPart.CPU;
import mode.visitor.computerPart.Memory;
import mode.visitor.computerPart.Monitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:19
 */
public class People implements Visitor {
    private double totalPrice = 0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice();
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice();
    }

    @Override
    public void visitMonitor(Monitor monitor) {
        totalPrice += monitor.getPrice();
    }

    public Double getPrice() {
        return totalPrice;
    }
}
