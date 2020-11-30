package command;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Invoker {

    //r如果Command是一个数组，初始化时可以全部初始华为EmptyCommand，这样可以再每次调用命令时不必进行判空操作
    private Command command = new EmptyCommand();

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
