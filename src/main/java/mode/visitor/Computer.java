package mode.visitor;

import mode.visitor.computerPart.CPU;
import mode.visitor.computerPart.Memory;
import mode.visitor.computerPart.Monitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:00
 */
public class Computer {
    // 电脑的组件
    private Memory memory;
    private CPU cpu;
    private Monitor monitor;

    public Computer() {
        memory = new Memory();
        cpu = new CPU();
        monitor = new Monitor();
    }

    public void accept(Visitor visitor) {
        monitor.accept(visitor);
        cpu.accept(visitor);
        memory.accept(visitor);
    }
}
