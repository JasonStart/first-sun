package com.proto.sun.templateMethod;

public abstract class HummerModel {

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
    //这么贵的悍马总得能跑吧  不管是人推  还是电力驱动
    public final void run() {
        //先发动汽车
        this.start();
        //引擎开始轰轰的响起来了
        this.engineBoom();
        //路上遇到一条野狗，按喇叭滴滴 吓走它
        this.alarm();
        //到达目的地
        this.stop();
    }
}
