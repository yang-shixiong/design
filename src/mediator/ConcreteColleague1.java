package mediator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("concrete colleague1 receive request");
    }

    @Override
    public void send() {
        System.out.println("concrete colleague1 send request");
        mediator.relay(this);
    }
}
