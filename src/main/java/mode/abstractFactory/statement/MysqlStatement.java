package mode.abstractFactory.statement;

/**
 * @Author ws
 * @Date 2021/4/12 16:17
 * @Version 1.0
 */
public class MysqlStatement implements Statement {
    public MysqlStatement() {
        System.out.println("MysqlStatement");
    }

    @Override
    public void getStatement() {

    }
}
