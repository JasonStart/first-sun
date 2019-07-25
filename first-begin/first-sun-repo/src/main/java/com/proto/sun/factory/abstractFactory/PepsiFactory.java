package com.proto.sun.factory.abstractFactory;

/**
 * Pepsi 生产 卡布奇诺 和 百事可乐
 */
public class PepsiFactory implements AbstractDrinkFactory {

    @Override
    public Coffee produceCoffee() {
        return new Cappuccino();
    }

    @Override
    public Sodas createSodas() {
        return new Pepsicola();
    }
}
