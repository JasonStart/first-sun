package com.proto.sun.keywords;

import org.junit.Test;

public class AbstractTest {

    /**
     *
     */
    @Test
    public void Test(){

        // 抽象类是用来捕捉子类的通用特性的 。它不能被实例化，只能被用作子类的超类。
       //  AbstarctPreson preson = new AbstarctPreson();
        AbstarctPreson preson = new Andy();

        preson.dirnk();

        try {
            preson.move();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
