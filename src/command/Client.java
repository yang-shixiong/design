package command;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommandA(new ReceiverA()));
        invoker.call();

        invoker.setCommand(new ConcreteCommandB(new ReceiverB()));
        invoker.call();

        /**
         * I am ReceiverA action, execute: concrete command A
         * I am receiverB action, execute: concrete command B
         */
    }
}
