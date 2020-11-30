package template;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
        /**
         * I am specific method
         * I am concrete method1
         * I am concrete method1
         */
    }
}
