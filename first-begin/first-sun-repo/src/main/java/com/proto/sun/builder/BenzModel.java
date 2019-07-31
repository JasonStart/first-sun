package com.proto.sun.builder;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:35
 */
public class BenzModel extends CarModel {

    //汽车发动
    @Override
    protected void start() {
        System.out.println("奔驰车 发动");
    }

    //汽车行驶停止
    @Override
    protected void stop() {
        System.out.println("奔驰车 行驶停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车 喇叭滴滴");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车 引擎轰隆隆响起来了");
    }
}
