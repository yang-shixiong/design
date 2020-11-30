package interpreter;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class NonTerminalExpression implements AbstractExpression {

    private AbstractExpression exp1;

    private AbstractExpression exp2;

    public NonTerminalExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public Object interpret() {
        return Integer.parseInt(this.exp1.interpret().toString()) + Integer.parseInt(this.exp2.interpret().toString());
    }
}
