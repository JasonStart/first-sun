package com.proto.sun.proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:21:29
 */
public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        /*IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是：2019-07-31 21:31:04");
        player.login("zhangsan","pwd321");
        player.killBoss();
        player.upGrade();
        System.out.println("结束时间是：2019-07-31 21:59:19");*/
        //定义一个痴迷的玩家
        /*IGamePlayer player = new GamePlayer("张三");
        //定义一个代练者
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        System.out.println("开始时间是：2019-07-31 22:31:04");
        //登录游戏
        proxy.login("zhangsan","pwd321");
        //开始打怪
        proxy.killBoss();
        //升级了
        proxy.upGrade();
        System.out.println("结束时间是：2019-07-31 22:59:19");*/



        try {
            //定义一个代练者
            GamePlayMoreProxy proxy = new GamePlayMoreProxy("张三");

            GamePlayerTow gamePlayerTow = new GamePlayerTow("李四");
            proxy.setGamePlayerTwo(gamePlayerTow);

            System.out.println("开始时间是：2019-08-31 22:31:04");
            //登录游戏
            proxy.login("zhangsan","pwd321");
            proxy.login("lisi","pwd321");
            //开始打怪
            proxy.killBoss();
            //升级了
            proxy.upGrade();
            System.out.println("结束时间是：2019-08-31 22:59:19");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
