package abstractFactory;

/**
 * 具体工厂2 生产具体产品 12 22
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂2生产了具体产品12");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 newProduce2() {
        System.out.println("具体工厂2生产了具体产品22");
        return new ConcreteProduct22();
    }
}