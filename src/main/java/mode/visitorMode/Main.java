package mode.visitorMode;

/**
 * @Author ws
 * @Date 2021/5/27 12:42
 */
public class Main {
    public static void main(String[] args) {
        ProjectElement projectElement = new ProjectElement("mobike", "share bicycle");
        projectElement.accept(new CEOVisitor());
        projectElement.accept(new CTOVisitor());
    }
}
