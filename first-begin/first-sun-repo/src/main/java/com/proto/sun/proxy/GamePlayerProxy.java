package com.proto.sun.proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:21:33
 */
public class GamePlayerProxy implements IGamePlayer ,IProxy{
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递需要给谁代练
    /*public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }*/

    //通过构造函数传递需要给谁代练
    public GamePlayerProxy(String userName) throws Exception{
        try{
            //this.gamePlayer = new GamePlayer(this,userName);
        } catch (Exception e) {
            throw new Exception("创建真实角色失败！");
        }
    }

    //代练登录
    @Override
    public void login(String userName, String password) {
        this.gamePlayer.login(userName, password);
    }
    //代练打怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //代练升级
    @Override
    public void upGrade() {
        this.gamePlayer.upGrade();
        this.countFree();
    }

    @Override
    public void countFree() {
        System.out.println("升级总费用是：150元");
    }
}
