package com.proto.sun.builder;

import java.util.ArrayList;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:46
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
