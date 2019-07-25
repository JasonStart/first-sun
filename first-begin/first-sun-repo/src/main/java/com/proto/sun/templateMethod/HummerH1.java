package com.proto.sun.templateMethod;

public class HummerH1 extends HummerModel {

    //汽车发动
    @Override
    protected void start() {
        System.out.println("悍马H1 发动");
    }

    //汽车行驶停止
    @Override
    protected void stop() {
        System.out.println("悍马H1 行驶停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1 喇叭滴滴");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1 引擎轰隆隆响起来了");
    }
}
