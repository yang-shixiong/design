package director;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class ProductA implements Product {

    private String partA;

    private String partB;

    private String partC;

    @Override
    public void setPartA(String partA) {
        this.partA = partA;
    }

    @Override
    public void setPartB(String partB) {
        this.partB = partB;
    }

    @Override
    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public void show() {
        System.out.println("ProductA{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}');
    }
}
