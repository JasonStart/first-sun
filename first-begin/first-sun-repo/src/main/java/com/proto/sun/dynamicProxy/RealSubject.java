package com.proto.sun.dynamicProxy;

/**
 * 真是主题
 * author:Jason
 * Date:2019/7/31
 * Time:23:20
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something !----->" +str);
    }
}
