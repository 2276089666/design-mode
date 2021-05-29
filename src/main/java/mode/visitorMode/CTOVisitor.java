package mode.visitorMode;

import java.util.Date;

/**
 * @Author ws
 * @Date 2021/5/27 12:41
 */
public class CTOVisitor implements Visitor{
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CTO 访问");
        System.out.println("ProjectName:\t"+element.getProjectName());
        System.out.println("ProjectContent:\t"+element.getProjectContent());
        element.signature("CTO",new Date());
    }
}
