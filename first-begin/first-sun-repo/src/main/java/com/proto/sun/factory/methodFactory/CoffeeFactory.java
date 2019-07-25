package com.proto.sun.factory.methodFactory;

import com.proto.sun.factory.abstractFactory.Coffee;

public interface CoffeeFactory {

    /**
     * 生产咖啡
     * @return
     */
    public Coffee produceCoffee();
}
