package abstractFactory;

/**
 * 具体产品11，实现抽闲产品1的接口
 */
public class ConcreteProduct11 implements Product1 {

    @Override
    public void run() {
        System.out.println("产品11开始跑了");
    }
}
