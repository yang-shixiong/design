package factoryMethod;

public class ClientFactoryMethod {
    public static void main(String[] args) {
        Product product;
        AbstractFactory abstractFactory;
        // 根据指定的具体工厂名生成工厂实例
        abstractFactory = (AbstractFactory) Util.getObject("ConcreteFactory1");
        // 生产产品
        product = abstractFactory.newProduct();
        // 调用产品方法
        product.show();
    }
}
