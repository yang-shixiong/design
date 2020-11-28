package director;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class ConcreteBuild1 extends Builder {
    public ConcreteBuild1(Product product) {
        super(product);
    }

    @Override
    protected void setPartA() {
        product.setPartA("ConcreteBuild1 setA");
    }

    @Override
    protected void setPartB() {
        product.setPartA("ConcreteBuild1 setB");
    }

    @Override
    protected void setPartC() {
        product.setPartA("ConcreteBuild1 setC");
    }
}
