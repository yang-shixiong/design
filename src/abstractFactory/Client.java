package abstractFactory;


public class Client {
    public static void main(String[] args) {
        // 模拟根据指定名称实例化工厂
        AbstractFactory abstractFactory = (AbstractFactory) Utils.getObject("ConcreteFactory1");
        // 获取该工厂的产品1
        Product1 product1 = abstractFactory.newProduct1();
        // 获取该工厂的产品2
        Product2 product2 = abstractFactory.newProduce2();
        // 运行产品1
        product1.run();
        // 运行产品2
        product2.show();
    }
}
