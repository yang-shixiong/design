package factory.method;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/27
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }
}
