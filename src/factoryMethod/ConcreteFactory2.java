package factoryMethod;

/**
 * 具体工厂2：实现抽象工程的生产产品方法
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生产了产品2");
        return new ConcreteProduct2();
    }
}
