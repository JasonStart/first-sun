package com.proto.sun.builder;

import java.util.ArrayList;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:39
 */
public abstract class CarBuilder {

    //建造一个模型，需要给我一个组装顺序要求
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完顺序后，就可以直接拿到一个车辆模型了
    public abstract CarModel getCarModel();
}
