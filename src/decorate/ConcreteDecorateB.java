package decorate;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class ConcreteDecorateB extends Decorator {
    public ConcreteDecorateB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        this.addFunction();
        component.operation();
    }

    private void addFunction() {
        System.out.println("this add function in concrete decorator B");
    }
}
