package director;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class Client {
    public static void main(String[] args) {
        Builder build = new ConcreteBuild1(new ProductA());
        Director director = new Director(build);
        Product product = director.construct();
        product.show(); // ProductA{partA='ConcreteBuild1 setC', partB='null', partC='null'}
    }
}
