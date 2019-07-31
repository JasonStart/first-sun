package com.proto.sun.dynamicProxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:23:28
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void execute() {
        System.out.println("我是一个前置通知，我被执行了！");
    }
}
