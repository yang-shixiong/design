package strategy;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Context context = new Context(strategyA);
        context.strategyMethod();

        context.setStrategy(new ConcreteStrategyB());
        context.strategyMethod();
        /**
         * concrete strategy A
         * concrete strategy B
         */
    }
}
