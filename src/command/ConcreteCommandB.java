package command;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ConcreteCommandB implements Command {

    private final ReceiverB receiverB;

    public ConcreteCommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
    }

    @Override
    public void execute() {
        receiverB.action("concrete command B");
    }
}
