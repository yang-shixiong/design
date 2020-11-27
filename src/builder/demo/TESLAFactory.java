package builder.demo;

/**
 * 特斯拉工厂
 */
public class TESLAFactory extends Factory {

    @Override
    public void buildWheel() {
        car.setWheel("4");
    }

    @Override
    public void buildLogo() {
        car.setLogo("TESLAFactory");
    }

    @Override
    public void buildPrice() {
        car.setPrice("30");
    }

}
