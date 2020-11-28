package director;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class ConcreteBuild2 extends Builder {
    public ConcreteBuild2(Product product) {
        super(product);
    }

    @Override
    protected void setPartA() {
        product.setPartA("ConcreteBuild2 setA");
    }

    @Override
    protected void setPartB() {
        product.setPartA("ConcreteBuild2 setB");
    }

    @Override
    protected void setPartC() {
        product.setPartA("ConcreteBuild3 setC");
    }
}
