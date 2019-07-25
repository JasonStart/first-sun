package com.proto.sun.templateMethod;

public class HummerH2 extends HummerModel {

    //汽车发动
    @Override
    protected void start() {
        System.out.println("悍马H2 发动");
    }

    //汽车行驶停止
    @Override
    protected void stop() {
        System.out.println("悍马H2 行驶停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2 喇叭哔哔");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2 引擎轰隆隆响起来了");
    }
}
