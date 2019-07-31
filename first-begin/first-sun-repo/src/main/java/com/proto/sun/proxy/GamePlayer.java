package com.proto.sun.proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:21:22
 */
public class GamePlayer implements IGamePlayer {
    private String name ="";
    //通过构造函数传递名字
    public GamePlayer(String name) {
        this.name = name;
    }
    //通过构造函数限制谁能创建对象，并同时传递姓名
    /*public GamePlayer(IGamePlayer _gamePlayer, String name) throws Exception{
        if(_gamePlayer ==null) {
            throw new Exception("不能直接创建真实角色！");
        } else {
            this.name = name;
        }
    }*/

    //进游戏之前你肯定是要登录的，这是一个必要条件
    @Override
    public void login(String userName, String password) {
        System.out.println("登录名为"+userName+"的用户"+this.name+"登录成功！");
    }
    //玩游戏打怪
    @Override
    public void killBoss() {
        System.out.println(this.name+"正在打怪！");
    }
    //升级，有很多方法，打怪是一种，花钱买是一种，做任务也是一种
    @Override
    public void upGrade() {
        System.out.println("恭喜用户"+this.name+"升了一级！");
    }
}
