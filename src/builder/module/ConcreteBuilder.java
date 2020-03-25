package builder.module;

/**
 * 具体建造者  需要实现抽象建造着接口
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPart1() {
        product.setPart1("建造 part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("建造 part2");
    }

    @Override
    public void buildPart3() {
        product.setPart3("建造 part3");
    }
}
