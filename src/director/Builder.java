package director;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public abstract class Builder {

    protected Product product;

    public Builder(Product product) {
        this.product = product;
    }

    protected abstract void setPartA();

    protected abstract void setPartB();

    protected abstract void setPartC();

    public Product getResult() {
        return product;
    }
}
