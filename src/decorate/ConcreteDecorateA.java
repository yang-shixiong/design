package decorate;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class ConcreteDecorateA extends Decorator {
    public ConcreteDecorateA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        this.addFunction();
    }

    private void addFunction() {
        System.out.println("add function in concrete decorate A");
    }
}
