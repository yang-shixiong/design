package interpreter;

import java.util.Stack;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Context {

    private Stack<AbstractExpression> exps = new Stack<>();

    public void operation(String info) {
        for (int i = 0; i < info.length(); i++) {
            char c = info.charAt(i);
            switch (c) {
                case '+':
                    char right = info.charAt(++i);
                    AbstractExpression terminalExpression = new NonTerminalExpression(exps.pop(), new TerminalExpression(String.valueOf(right)));
                    exps.push(terminalExpression);
                    break;
                default:
                    exps.push(new TerminalExpression(String.valueOf(c)));
            }
        }

        AbstractExpression pop = exps.pop();
        System.out.println("result==>: " + pop.interpret());
    }
}
