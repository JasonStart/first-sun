package com.proto.sun.proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:22:17
 */
public class GamePlayMoreProxy implements IGamePlayer ,IProxy{
    //第一个玩家
    private IGamePlayer gamePlayerOne = null;
    //第二个玩家
    private IGamePlayer gamePlayerTwo = null;
    //判断是否是第一个玩家
    private boolean firstPlayer = true;

    //通过构造函数传递需要给谁代练
    /*public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }*/

    //通过构造函数传递需要给谁代练
    public GamePlayMoreProxy(String userName) throws Exception{
        try{
            //this.gamePlayerOne = new GamePlayer(this,userName);

        } catch (Exception e) {
            throw new Exception("创建真实角色失败！");
        }
    }

    //代练登录
    @Override
    public void login(String userName, String password) {
        if(this.firstPlayer){
            this.gamePlayerOne.login(userName, password);
            this.firstPlayer = false;
        } else {
            this.gamePlayerTwo.login(userName, password);
        }
    }
    //代练打怪
    @Override
    public void killBoss() {
        this.gamePlayerOne.killBoss();
        this.gamePlayerTwo.killBoss();
    }
    //代练升级
    @Override
    public void upGrade() {
        this.gamePlayerOne.upGrade();
        this.countFree();
    }

    @Override
    public void countFree() {
        System.out.println("升级总费用是：150元");
    }

    public void setGamePlayerTwo(IGamePlayer gamePlayerTwo) {
        this.gamePlayerTwo = gamePlayerTwo;
    }
}
