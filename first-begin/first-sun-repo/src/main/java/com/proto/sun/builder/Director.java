package com.proto.sun.builder;

import java.util.ArrayList;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:55
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();
    //奔驰车建造者
    private BenzBuilder benzBuilder = new BenzBuilder();
    //宝马车建造者
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     *  A类型的奔驰车模型，只需要先start，然后stop 其他什么引擎、喇叭一概没有
     * @return BenzModel
     */
    public BenzModel getBenzModelForA(){
        //清理场景，顺序重置
        this.sequence.clear();
        this.sequence.add("start"); //汽车启动
        this.sequence.add("stop"); //汽车停止了

        //把建造顺序给到建造者
        this.benzBuilder.setSequence(sequence);
        //就可以制造出一辆奔驰了
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     *  B类型的奔驰车模型，先发动引擎，然后启动，然后stop 喇叭没有
     * @return BenzModel
     */
    public BenzModel getBenzModelForB(){
        //顺序重置
        this.sequence.clear();
        this.sequence.add("engine boom"); //先发动引擎
        this.sequence.add("start"); //汽车启动
        this.sequence.add("stop"); //汽车停止了

        //把建造顺序给到建造者
        this.benzBuilder.setSequence(sequence);
        //就可以制造出一辆奔驰了
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     *  C类型的宝马车模型，先按下喇叭滴滴两声，然后start，然后stop
     * @return BMWModel
     */
    public BMWModel getBMWModelForC(){
        //顺序重置
        this.sequence.clear();
        this.sequence.add("alarm"); //先按下喇叭滴滴
        this.sequence.add("start"); //汽车启动
        this.sequence.add("stop"); //汽车停止了

        //把建造顺序给到建造者
        this.bmwBuilder.setSequence(sequence);
        //就可以制造出一辆奔驰了
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /**
     *  D类型的宝马车模型，永动机 只会一直跑
     * @return BMWModel
     */
    public BMWModel getBMWModelForD(){
        //顺序重置
        this.sequence.clear();
        this.sequence.add("start"); //汽车启动

        //把建造顺序给到建造者
        this.bmwBuilder.setSequence(sequence);
        //就可以制造出一辆奔驰了
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
