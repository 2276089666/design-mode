package mode.behavioral.visitor.visitors;

import mode.behavioral.visitor.Visitor;
import mode.behavioral.visitor.computerPart.CPU;
import mode.behavioral.visitor.computerPart.Memory;
import mode.behavioral.visitor.computerPart.Monitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:15
 */
public class StudentVisitor implements Visitor {
    private double totalPrice = 0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }

    @Override
    public void visitMonitor(Monitor monitor) {
        totalPrice += monitor.getPrice() * 0.7;
    }

    public Double getPrice() {
        return totalPrice;
    }
}
