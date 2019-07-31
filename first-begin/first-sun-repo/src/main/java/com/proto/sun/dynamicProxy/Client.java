package com.proto.sun.dynamicProxy;

import com.proto.sun.proxy.GamePlayer;
import com.proto.sun.proxy.GamePlayerIH;
import com.proto.sun.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *
 *动态代理场景类
 * author:Jason
 * Date:2019/7/31
 * Time:23:30
 */
public class Client {

    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个handler
        InvocationHandler handler = new MyHandler(subject);
        //获得类的class loader
        ClassLoader cl = subject.getClass().getClassLoader();
        //定义主题代理
        Subject proxy = DynamicProxy.newProxyInstance(cl,subject.getClass().getInterfaces(),handler);
        //代理行为
        proxy.doSomething("Finish");
    }
}
