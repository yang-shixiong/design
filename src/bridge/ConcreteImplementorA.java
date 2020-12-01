package bridge;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA");
    }
}
