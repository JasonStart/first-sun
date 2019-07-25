package com.proto.sun.factory.abstractFactory;

/**
 * Coca 生产 美式咖啡 和 可口可乐
 */
public class CocaFactory implements AbstractDrinkFactory {

    @Override
    public Coffee produceCoffee() {
        return new Americano();
    }

    @Override
    public Sodas createSodas() {
        return new CocaCola();
    }
}
