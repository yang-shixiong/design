package mediator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("concrete colleague2 receive request");
    }

    @Override
    public void send() {
        System.out.println("concrete colleague2 send request");
        mediator.relay(this);
    }
}
