package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author yangshixiong
 * Date 2020/11/29
 */
public class Composite implements Component {

    private String name;

    private List<Component> children = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int t) {
        if (children.size() > t)
            return children.get(t);
        return null;
    }

    @Override
    public void operation() {
        System.out.println("this is composite, name : " + this.name);
        for (Component child : children) {
            child.operation();
        }
    }
}
