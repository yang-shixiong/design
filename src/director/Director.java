package director;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        // 进行拼装的逻辑放在了这里
        builder.setPartA();
        builder.setPartB();
        builder.setPartC();
        return builder.getResult();
    }
}
