package bridge;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstraction, if there needs, the could be more RefinedAbstraction");
        implementor.operationImpl();
    }
}
