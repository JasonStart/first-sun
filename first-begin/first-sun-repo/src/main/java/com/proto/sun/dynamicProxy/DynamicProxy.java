package com.proto.sun.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:23:23
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader,
                                         Class<?>[] interfaces,
                                         InvocationHandler h) {
        //寻找JoinPoint连接点
        if(true){
            (new BeforeAdvice()).execute();
        }
        //执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
