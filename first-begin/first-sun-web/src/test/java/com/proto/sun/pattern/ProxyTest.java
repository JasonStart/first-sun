package com.proto.sun.pattern;

import com.proto.sun.proxy.*;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式包含如下角色：
 *
 * ISubject：抽象主题角色，是一个接口。该接口是对象和它的代理共用的接口。
 *
 * RealSubject：真实主题角色，是实现抽象主题接口的类。
 *
 * Proxy：代理角色，内部含有对真实对象RealSubject的引用，从而可以操作真实对象。代理对象提供与真实对象相同的接口，以便在任何时刻都能代替真实对象。同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 *
 * 实现动态代理的关键技术是反射。
 */
public class ProxyTest {

    /**
     * 聚合实现方式中代理类聚合了被代理类，且代理类及被代理类都实现了同一个接口
     */
    @Test
    public void staticProxyTest() {

        float a = 780l;
        float b = 795l;

        // float res = a/b; //((780 / 795) - 1) * 0.5 * 4.83 * 15000;
        double res = (0.17 -0 ) / 6.4035 * 12632160 * 1 / 12;

        System.out.println(res);

//        Smith smithOne = new Smith();
//        smithOne.buyTicket();
//
//        Tom tom = new Tom();   // 首先得有被代理人
//        Smith  smithTwo = new Smith(tom);  //  Tom 说 Simth麻烦帮我去买张火车票
//        smithTwo.buyTicket();     // Simth 跑了趟火车站 买到了
    }

    /**
     * JDK动态代理步骤
     *  1.  创建一个实现InvocationHandler接口的类，它必须实现invoke()方法
     *
     *  2.  创建被代理的类及接口
     *
     *  3.  调用Proxy的静态方法，创建一个代理类
     *
     *  4.  通过代理调用方法
     * @throws Exception
     */
    @Test
    public void JDKproxyTest() throws Exception {
        // 被代理类
        Car car = new Car();
        //  实现InvocationHandler接口的类
        InvocationHandler timeHandler = new TimeHandler(car);
        Class<?> cls = car.getClass();
        /**
         *loader 类加载器
         *interfaces 实现接口
         *h InvocationHandler
         *
         * public final class $Proxy1 extends Proxy implements Moveable{}
         *
         *  生成的代理类是继承了Proxy类的，这就是说明了为什么使用JDK动态代理不能实现继承式动态代理，
         *  原因是Java不允许多继承，而生成的代理类本身就已经继承了Proxy类
         */
        Moveable carProxy = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), timeHandler);
        carProxy.move();
    }

    /**
     * 在ProxyClassFactory中，可以看到产生代理类的具体逻辑，大致上是，根据传递的被代理类及其实现的接口生成代理类的字节码加载到缓存中，
     * 但是加载到缓存中只是一个.java文件也不能用，所以底层还有编译等操作。到这里，可以大致的看清JDK中动态代理的面孔了，实现的步骤为：
     * 1.      创建代理类的源码；
     *
     * 2.      对源码进行编译成字节码；
     *
     * 3.      将字节码加载到内存；
     *
     * 4.      实例化代理类对象并返回给调用者；
     */
    @Test
    public void  proxyGeneratorTest(){

        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy1", Car.class.getInterfaces());
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(System.getProperty("user.dir") + "\\$Proxy1.class");
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Java 的单继承机制注定了这些动态代理类们无法实现对 class 的动态代理。好在有cglib为Proxy提供了弥补
     */
    @Test
    public void cGLibProxyTest() {
        CGLibProxy proxy = new CGLibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();
    }
}
