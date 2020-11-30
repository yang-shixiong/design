package state;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        /**
         * current state is A
         * current state is B
         * current state is A
         * current state is B
         */
    }
}
