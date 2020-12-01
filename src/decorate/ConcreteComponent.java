package decorate;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("i am concrete component");
    }
}
