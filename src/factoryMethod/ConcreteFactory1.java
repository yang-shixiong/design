package factoryMethod;

/**
 * 具体工厂1：实现抽象工程的生产产品方法
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生产了产品1");
        return new ConcreteProduct1();
    }
}
