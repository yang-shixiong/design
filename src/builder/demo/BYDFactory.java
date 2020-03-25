package builder.demo;

/**
 * 比亚迪工厂
 */
public class BYDFactory extends Factory {
    @Override
    public void buildWheel() {
        car.setWheel("4");
    }

    @Override
    public void buildLogo() {
        car.setLogo("BYD");
    }

    @Override
    public void buildPrice() {
        car.setPrice("10");
    }
}
