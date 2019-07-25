package com.proto.sun.templateMethod;

public class HummerH1Ext extends HummerModelExt {

    //默认喇叭要响
    private boolean alarmFlag = true;

    //汽车发动
    @Override
    protected void start() {
        System.out.println("悍马H1 发动");
    }

    //汽车行驶停止
    @Override
    protected void stop() {
        System.out.println("悍马H1 行驶停止");
    }

    // 汽车喇叭响起来
    @Override
    protected void alarm() {
        System.out.println("悍马H1 喇叭滴滴");
    }

    //汽车引擎响起来了
    @Override
    protected void engineBoom() {
        System.out.println("悍马H1 引擎轰隆隆响起来了");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
