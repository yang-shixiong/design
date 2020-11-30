package facade;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
        /**
         * SubSystem1
         * SubSystem2
         * SubSystem3
         */
    }
}
