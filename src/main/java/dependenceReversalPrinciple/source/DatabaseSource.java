package dependenceReversalPrinciple.source;

import dependenceReversalPrinciple.AbstractSource;

/**
 * @Author ws
 * @Date 2021/3/14 20:17
 * @Version 1.0
 */
public class DatabaseSource extends AbstractSource {
    @Override
    public void Source() {
        System.out.println("DatabaseSource");
    }
}
