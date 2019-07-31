package com.proto.sun.builder;

import java.util.ArrayList;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:48
 */
public class Client {

    public static void main(String[] args) {

        //存放run顺序
        /*ArrayList<String> sequence = new ArrayList<String>();

        sequence.add("engine boom"); //客户要求，run的时候是先发动引擎
        sequence.add("start"); //汽车启动
        sequence.add("stop"); //汽车停止了

        //现在客户要一辆这样子的奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        //把建造顺序给到建造者
        benzBuilder.setSequence(sequence);
        //就可以制造出一辆奔驰了
        CarModel benz = benzBuilder.getCarModel();
        //跑一跑看一看
        benz.run();*/

        Director director = new Director();
        //需要10俩A类型的奔驰车就很简单了
        for(int i=0;i<10;i++) {
            director.getBenzModelForA().run();
        }

        //需要20俩D类型的宝马车
        for(int i=0;i<20;i++) {
            director.getBMWModelForD().run();
        }
    }
}
