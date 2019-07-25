package com.proto.sun.factory.methodFactory;

import com.proto.sun.factory.abstractFactory.Coffee;
import com.proto.sun.factory.abstractFactory.Latte;

public class ChinaCoffeeFactory implements CoffeeFactory {



    public Coffee produceCoffee() {
        return new Latte();
    }
}
