package factory.abs;

import factory.abs.product.Animal;
import factory.abs.product.Plant;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class Client {

    public static void main(String[] args) throws Exception {
        String sgFarm = "factory.abs.SGFarm";
        Farm farm = (Farm) Class.forName(sgFarm).getDeclaredConstructor().newInstance();
        Animal animal = farm.newAnimal();
        animal.show();
        Plant plant = farm.newPlant();
        plant.show();
    }
}
