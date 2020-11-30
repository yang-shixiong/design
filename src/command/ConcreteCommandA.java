package command;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteCommandA implements Command {

    private final ReceiverA receiverA;

    public ConcreteCommandA(ReceiverA receiverA) {
        this.receiverA = receiverA;
    }

    @Override
    public void execute() {
        receiverA.action("concrete command A");
    }
}
