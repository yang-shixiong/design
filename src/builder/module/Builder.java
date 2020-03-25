package builder.module;

/**
 * 抽象构建者
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract void buildPart3();

    /**
     * 返回产品对象
     *
     * @return 产品对象
     */
    public Product getResult() {
        return product;
    }
}
