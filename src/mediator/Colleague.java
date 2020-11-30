package mediator;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
