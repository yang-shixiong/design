package factory.abs.product;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class Fruit implements Plant {
    @Override
    public void show() {
        System.out.println("I am fruit");
    }
}
