package com.proto.sun.builder;

import java.util.ArrayList;

/**
 * author:Jason
 * Date:2019/7/29
 * Time:22:42
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence); ;
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
