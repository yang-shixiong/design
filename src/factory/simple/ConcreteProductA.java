package factory.simple;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/27
 */
public class ConcreteProductA implements Product {
    @Override
    public void show() {
        System.out.println("i am ConcreteProductA");
    }
}