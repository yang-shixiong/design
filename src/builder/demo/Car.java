package builder.demo;

public class Car {

    private String wheel;

    private String logo;

    private String price;

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void show() {
        System.out.println("我是：" + logo + "，有" + wheel + "个轮子，我的售价" + price + "万元");
    }
}
