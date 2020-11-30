package interpreter;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class TerminalExpression implements AbstractExpression {

    public String info;

    public TerminalExpression(String info) {
        this.info = info;
    }

    @Override
    public Object interpret() {
        return this.info;
    }
}
