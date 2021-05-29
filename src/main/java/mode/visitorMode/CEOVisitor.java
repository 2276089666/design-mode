package mode.visitorMode;

import java.util.Date;

/**
 * @Author ws
 * @Date 2021/5/27 12:35
 */
public class CEOVisitor implements Visitor{
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CEO 访问");
        System.out.println("ProjectName:\t"+element.getProjectName());
        System.out.println("ProjectContent:\t"+element.getProjectContent());
        element.signature("CEO",new Date());
    }
}
