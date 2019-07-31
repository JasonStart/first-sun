package com.proto.sun.proxy;

/**
 * author:Jason
 * Date:2019/7/31
 * Time:21:19
 */
public interface IGamePlayer {
    //登陆游戏
    public void login(String userName,String password);
    //杀怪
    public void killBoss();
    //升级
    public void upGrade();
}
