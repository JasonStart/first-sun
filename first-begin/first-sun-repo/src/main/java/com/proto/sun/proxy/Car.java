package com.proto.sun.proxy;

import java.util.Random;

public class Car implements Moveable{

    @Override
    public void move() throws Exception{
        Thread.sleep(new Random().nextInt(1000));  
        System.out.println("汽车行驶中…");  
    }
}
