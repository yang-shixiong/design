package template;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();

    }

    private void specificMethod() {
        System.out.println("I am specific method");
    }

    protected abstract void abstractMethod1();

    protected abstract void abstractMethod2();
}
