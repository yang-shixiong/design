package composite;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException();
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException();
    }

    @Override
    public Component getChild(int t) {
        throw new RuntimeException();
    }

    @Override
    public void operation() {
        System.out.println("this is leaf, name: " + this.name);
    }
}
