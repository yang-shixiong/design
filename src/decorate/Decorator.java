package decorate;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public abstract void operation();
}
