package composite;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int t);

    void operation();
}
