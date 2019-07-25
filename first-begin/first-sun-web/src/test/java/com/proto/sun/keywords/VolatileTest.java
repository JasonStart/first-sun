package com.proto.sun.keywords;

import org.junit.Test;

public class VolatileTest {

    /*
     *  volatile的两大特性：禁止重排序、内存可见性
     *  不同是变量i的修饰flags多了一个ACC_VOLATILE标识
     *   底层基于C++的volatile实现 因为volatile自带了编译器屏障的功能，总能拿到内存中的最新值。
     */

    /*
     *   编译器重排序:
     *   编译器在不改变单线程语义的前提下，为了提高程序的运行速度，可以对字节码指令进行重新排序
     */

    int a = 0;
    int b = 0;

    public void set() {
        a = 1;
        b = 1;
    }

    public void loop() {

        System.out.println("a---" + a + "b---"+b);
        if (b == 1) {
            System.out.println("i'm first");
        }
       // while (b == 0) continue;
        if (a == 1) {
            System.out.println("i'm here");
        } else {
            System.out.println("what's wrong");
        }
    }

    @Test
    public void Test () {
        Thread A = new Thread() {
            public void run(){
                set();
            }
        };

        Thread B = new Thread(){
            public void run(){
                loop();
            }
        };

        A.start();
        B.start();

    }
}
