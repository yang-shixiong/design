package factory.simple;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/27
 */
public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.getProduct(1);
        product.show();
    }
}