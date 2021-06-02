package mode.visitor;

import mode.visitor.computerPart.CPU;
import mode.visitor.computerPart.Memory;
import mode.visitor.computerPart.Monitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:06
 */
public interface Visitor {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitMonitor(Monitor monitor);
}
