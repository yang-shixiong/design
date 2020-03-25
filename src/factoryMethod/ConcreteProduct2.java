package factoryMethod;

/**
 * 具体产品2：实现抽象产品中的接口
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("我是具体产品2********");
    }
}
