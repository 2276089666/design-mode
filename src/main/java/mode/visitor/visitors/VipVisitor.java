package mode.visitor.visitors;

import mode.visitor.Visitor;
import mode.visitor.computerPart.CPU;
import mode.visitor.computerPart.Memory;
import mode.visitor.computerPart.Monitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:18
 */
public class VipVisitor implements Visitor {
    private double totalPrice = 0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.7;
    }

    @Override
    public void visitMonitor(Monitor monitor) {
        totalPrice += monitor.getPrice() * 0.6;
    }

    public Double getPrice() {
        return totalPrice;
    }
}
