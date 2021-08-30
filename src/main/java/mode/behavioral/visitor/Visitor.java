package mode.behavioral.visitor;

import mode.behavioral.visitor.computerPart.CPU;
import mode.behavioral.visitor.computerPart.Memory;
import mode.behavioral.visitor.computerPart.Monitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:06
 */
public interface Visitor {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitMonitor(Monitor monitor);
}
