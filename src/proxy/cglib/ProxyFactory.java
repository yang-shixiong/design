package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class ProxyFactory implements MethodInterceptor {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 返回子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("pre request");
        Object invoke = method.invoke(target, args);
        System.out.println("post request");
        return invoke;
    }
}
