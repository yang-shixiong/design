package bridge;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract void operation();
}
