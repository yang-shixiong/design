package factory.simple;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/27
 */
public class SimpleFactory {

    public static Product getProduct(int type){
        if(type == 1){
            return new ConcreteProductA();
        }else if (type ==2){
            return new ConcreteProduceB();
        }
        throw new IllegalArgumentException();
    }
}