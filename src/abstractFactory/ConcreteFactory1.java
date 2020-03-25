package abstractFactory;

/**
 * 具体工厂1 生产具体产品 11 21
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂1生产了具体产品11");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduce2() {
        System.out.println("具体工厂1生产了具体产品21");
        return new ConcreteProduct21();
    }
}
