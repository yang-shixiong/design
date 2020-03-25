package abstractFactory;

/**
 * 具体产品12，实现抽闲产品1的接口
 */
public class ConcreteProduct12 implements Product1 {

    @Override
    public void run() {
        System.out.println("产品12开始跑了");
    }
}
