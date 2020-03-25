package builder.module;

/**
 * 指挥者
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 产品构建以及组装方法
     * @return 完成构建的产品
     */
    public Product construct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.getResult();
    }
}
