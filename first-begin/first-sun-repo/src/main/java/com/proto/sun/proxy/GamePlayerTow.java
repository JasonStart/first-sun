package com.proto.sun.proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:22:24
 */
public class GamePlayerTow implements IGamePlayer{


    private String name;
    //通过构造函数传递名字
    public GamePlayerTow(String name) {
        this.name = name;
    }

    //进游戏之前你肯定是要登录的，这是一个必要条件
    @Override
    public void login(String userName, String password) {
        System.out.println("登录名为"+userName+"的用户"+this.name+"登录成功！");
    }
    //玩游戏打怪
    @Override
    public void killBoss() {
        System.out.println(this.name+"是奶妈，可以给队友加血！");
    }
    //升级，有很多方法，打怪是一种，花钱买是一种，做任务也是一种
    @Override
    public void upGrade() {
        System.out.println("恭喜用户"+this.name+"升了一级！");
    }
    //提供一个获取name的方法
    public String getName() {
        return name;
    }
}
