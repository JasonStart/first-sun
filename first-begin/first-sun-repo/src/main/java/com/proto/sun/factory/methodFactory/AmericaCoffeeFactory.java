package com.proto.sun.factory.methodFactory;


import com.proto.sun.factory.abstractFactory.Americano;
import com.proto.sun.factory.abstractFactory.Coffee;

public class AmericaCoffeeFactory implements CoffeeFactory {

    public Coffee produceCoffee() {
        return new Americano();
    }
}
