package strategy;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/30
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("concrete strategy A");
    }
}
