package com.proto.sun.pattern;


import com.proto.sun.singleton.EagerSingleton;
import com.proto.sun.singleton.SingletonEnum;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class SingletonTest {


    @Test
    public void capabilityTest() {

        int count = 200;

        for (int i = 0; i< count;i++) {
            SingletonEnum.uniqueInstance.singletonOperation();
        }
    }

    @Test
    public void reflectionTest(){
        try {

            EagerSingleton s1 = EagerSingleton.getInstance();
            Class<EagerSingleton> cls = EagerSingleton.class;
            Constructor<EagerSingleton> constructor = cls
                    .getDeclaredConstructor(new Class[] {});
            constructor.setAccessible(true);
            EagerSingleton s2 = constructor.newInstance(new Object[] {});

            System.out.println("s1 :" +s1);
            System.out.println("s1 :" +s2);

            System.out.println(s1 == s2);//false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void threadTest() {

    }
 }
