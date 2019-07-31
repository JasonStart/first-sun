package com.proto.sun.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理 Handler
 * author:Jason
 * Date:2019/7/31
 * Time:23:21
 */
public class MyHandler implements InvocationHandler {

    //被代理的实例
    Object obj = null;

    public MyHandler (Object _obj){
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj,args);
    }
}
