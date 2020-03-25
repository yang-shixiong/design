package builder.demo;

/**
 * 4s销售点
 */
public class Agent {
    private Factory factory;

    public Agent(Factory factory){
        this.factory = factory;
    }

    public Car construct(){
        factory.buildWheel();
        factory.buildLogo();
        factory.buildPrice();
        return factory.getResult();
    }
}
