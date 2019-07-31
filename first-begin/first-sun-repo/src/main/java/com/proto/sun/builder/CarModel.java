package com.proto.sun.builder;

import java.util.ArrayList;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:21:17
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    /**
     * 首先，这个模型要能发动起来，不管是手摇还是电力发动，
     * 反正是要能够发动起来，那这个实现要实现在子类里
     */
    protected abstract void start();
    //能发动，也得能停下来
    protected abstract void stop();
    //喇叭能叫，是滴滴，还是哔哔呢
    protected abstract void alarm();
    //引擎需要会轰隆隆的响，这才是真悍马
    protected abstract void engineBoom();

    //那个模型总得能跑吧  不管是人推  还是电力驱动
    public final void run() {

        for(String actionName : sequence) {
            if(actionName.equalsIgnoreCase("start")) {
                //先发动汽车
                this.start();
            } else if (actionName.equalsIgnoreCase("alarm")){
                //路上遇到一条野狗，按喇叭滴滴 吓走它
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                //引擎开始轰轰的响起来了
                this.engineBoom();
            } else if(actionName.equalsIgnoreCase("stop")) {
                //到达目的地
                this.stop();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
