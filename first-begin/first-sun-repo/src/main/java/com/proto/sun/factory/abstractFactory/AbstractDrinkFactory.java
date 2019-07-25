package com.proto.sun.factory.abstractFactory;

public interface AbstractDrinkFactory {

    /**
     * 生产咖啡
     * @return
     */
    public Coffee produceCoffee();

    /**
     * 生产碳酸饮料
     * @return
     */
    public Sodas createSodas();
}
