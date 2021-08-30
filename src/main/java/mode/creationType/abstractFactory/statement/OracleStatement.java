package mode.creationType.abstractFactory.statement;

/**
 * @Author ws
 * @Date 2021/4/12 16:17
 * @Version 1.0
 */
public class OracleStatement implements Statement {
    public OracleStatement() {
        System.out.println("OracleStatement");
    }

    @Override
    public void getStatement() {

    }
}
