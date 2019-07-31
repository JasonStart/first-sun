package com.proto.sun.builder;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:36
 */
public class BMWModel extends CarModel {

    //汽车发动
    @Override
    protected void start() {
        System.out.println("宝马车 发动");
    }

    //汽车行驶停止
    @Override
    protected void stop() {
        System.out.println("宝马车 行驶停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车 喇叭滴滴");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车 引擎轰隆隆响起来了");
    }
}
