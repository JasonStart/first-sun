package com.proto.sun.proxy;

import java.util.Date;
import java.util.Random;

/**
 *  代理主题类
 * Smith 是专业的车票代购人员
 */
public class Smith implements Person{

    // 被代理人
    private Person person;

    public Smith(){
        super();
        this.person = new Jack();
    }

    public Smith(Person proxyPerson){
        this.person = proxyPerson;
    }

    @Override
    public void buyTicket() {
        // 实现自己私有的业务，（如日志记录等）
        System.out.println("Smith现在开始去买票--："+ new Date());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        person.buyTicket();

        System.out.println("Smith买到票了--："+ new Date());
    }
}
