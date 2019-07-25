package com.proto.sun.proxy;

/**
 *  真实主题类
 */
public class Jack implements Person{

    public void eat(){
        System.out.println("饿了就要吃饭！");
    }
    
    public void Drink(){
        System.out.println("渴了就要喝水！");
    }
    
    @Override
    public void buyTicket(){
        System.out.println("Jack的火车票！");
    }

}
