package com.proto.sun.factory.simple;

import com.proto.sun.factory.abstractFactory.Americano;
import com.proto.sun.factory.abstractFactory.Cappuccino;
import com.proto.sun.factory.abstractFactory.Coffee;
import com.proto.sun.factory.abstractFactory.Latte;

public class SimpleFactory {

    public Coffee produceCoffee(String type) {

        if ("Americano".equals(type)) {
           return new Americano();
        } else if("Cappuccino".equals(type)) {
            return new Cappuccino();
        } else if ("Latte".equals(type)) {
            return new Latte();
        } else {
            throw new RuntimeException("type["+type+"]类型不可识别，没有匹配到可实例化的对象！");
        }
    }
}
