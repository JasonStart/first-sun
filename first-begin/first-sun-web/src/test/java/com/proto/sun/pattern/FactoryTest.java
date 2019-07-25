package com.proto.sun.pattern;


import com.proto.sun.factory.abstractFactory.Coffee;
import com.proto.sun.factory.abstractFactory.AbstractDrinkFactory;
import com.proto.sun.factory.abstractFactory.CocaFactory;
import com.proto.sun.factory.abstractFactory.PepsiFactory;
import com.proto.sun.factory.methodFactory.AmericaCoffeeFactory;
import com.proto.sun.factory.methodFactory.ChinaCoffeeFactory;
import com.proto.sun.factory.methodFactory.CoffeeFactory;
import com.proto.sun.factory.simple.SimpleFactory;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void drinkCoffee() {

        SimpleFactory simpleFactory = new SimpleFactory();

        Coffee latte = simpleFactory.produceCoffee("Latte");

        System.out.println("我最喜欢喝" + latte.getCoffeeName());

        Coffee cappuccino = simpleFactory.produceCoffee("Cappuccino");

        System.out.println("我最喜欢喝" + cappuccino.getCoffeeName());
    }

    @Test
    public void wholesaleCoffee() {

        CoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();

        System.out.println("中国工厂生产的是：" + chinaCoffeeFactory.produceCoffee().getCoffeeName());

        CoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();

        System.out.println("美国工厂生产的是：" + americaCoffeeFactory.produceCoffee().getCoffeeName());

    }

    @Test
    public void drinking() {

        AbstractDrinkFactory PepsiFactory = new PepsiFactory();

        System.out.println("百事公司生产：" + PepsiFactory.produceCoffee().getCoffeeName() + "---" + PepsiFactory.createSodas().getSodasName());

        AbstractDrinkFactory cocaFactory = new CocaFactory();

        System.out.println("可口可乐公司生产：" + cocaFactory.produceCoffee().getCoffeeName() + "---" + cocaFactory.createSodas().getSodasName());
    }
}
