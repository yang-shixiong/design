/**
 * Copyright(c) JingHong Technology Co., Ltd.
 * All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of JingHong
 * Technology Co.,Ltd. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with JingHong.
 * For more information about JingHong, welcome to https://www.imagego.com
 * <p>
 * Revision History:
 * Date         Version    Name       Description
 * 2020/11/27     1.0        mark       File Creation
 */
package singleton;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/27
 */
public class Singleton {

    // 1. 饿汉式，静态常量(volatile防止懒汉式加载出现指令重排)
    private volatile static Singleton INSTANCE = new Singleton();

    // 2. 饿汉式，静态代码块
    static {
        INSTANCE = new Singleton();
    }

//    public static Singleton getInstance(){
//        return INSTANCE;
//    }


    // 3. 懒汉式，加锁创建
//    private static synchronized Singleton getInstance(){
//        if(INSTANCE == null){
//            INSTANCE = new Singleton();
//        }
//        return INSTANCE;
//    }

    // 4.双重检查，这个其实是上面的优化，在并发场景下，如果对象已经实例化了，
    // 就不需要在加锁，加锁是一个比较重的操作，因此单例模式，很少会是一个线程频繁调用，所以一般也不会出现偏向锁
//    private static Singleton getInstance() {
//        if (INSTANCE == null) {
//            synchronized (Singleton.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new Singleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    // 5. 静态内部类创建，这个SingleTonFactory里面的属性，并不会在Singleton类加载的时候创建
    private static class SingleTonFactory {
        public static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingleTonFactory.INSTANCE;
    }
}