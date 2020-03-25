package builder.module;

/**
 * 产品角色
 */
public class Product {

    private String part1;

    private String part2;

    private String part3;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    /**
     * 显示产品特性
     */
    public void show(){
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
    }
}
