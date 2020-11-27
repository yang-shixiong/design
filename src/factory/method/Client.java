package factory.method;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/27
 */
public class Client {

    public static void main(String[] args) {
        // 这里也可使用配置文件读入的一个类名，通过反射获取
        AbstractFactory factory = new ConcreteFactory1();
        Product product = factory.newProduct();
        product.show();
    }
}
