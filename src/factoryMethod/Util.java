package factoryMethod;

public class Util {

    public static Object getObject(String name){
        String cName = "factoryMethod." + name;
        System.out.println("新类名："+cName);
        Class<?> c = null;
        try {
            // 根据名称获取类
            c = Class.forName(cName);
            // 调用该类的无参构造方法并获取实例
            return c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            // 异常
            e.printStackTrace();
            return c;
        }
    }
}
