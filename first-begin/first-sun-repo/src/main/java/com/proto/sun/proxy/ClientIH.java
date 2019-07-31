package com.proto.sun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:22:59
 */
public class ClientIH {

    public static void main(String[] args) {
        //定义一个痴迷玩家
        GamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayerIH(player);
        System.out.println("开始时间是：2019-07-31 21:31:04");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        //登录游戏
        proxy.login("zhangsan","pwd321");
        //开始打怪
        proxy.killBoss();
        //升级了
        proxy.upGrade();
        System.out.println("结束时间是：2019-08-31 22:59:19");
    }
}
