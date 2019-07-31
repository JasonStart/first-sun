package com.proto.sun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:22:55
 */
public class GamePlayerIH implements InvocationHandler {
    //被代理的实例
    Object obj = null;

    public GamePlayerIH (Object _obj){
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        if(method.getName().equalsIgnoreCase("login")) {
            System.out.println("用户："+args[0] +"你好，有人在登录您的账号！");
        }
        return result;
    }
}
