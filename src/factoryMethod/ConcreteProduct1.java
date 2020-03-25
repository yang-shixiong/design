package factoryMethod;

/**
 * 具体产品1：实现抽象产品中的接口
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("我是具体产品1----");
    }
}
