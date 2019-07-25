package com.proto.sun.keywords;

public class VolatileSample {

    int a = 0;
    int b = 0;

    public void set() {
        System.out.println("set pre a---" + a + "b---"+b);
        a = 1;
        b = 1;
        System.out.println("set a---" + a + "b---"+b);

    }

    public void loop() {

        System.out.println("loop a---" + a + "b---"+b);
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

    public static void main(String[] args) {

        VolatileSample vs = new VolatileSample();

        ThreadA A = new ThreadA(vs);
        ThreadB B = new ThreadB(vs);

        new Thread(A).start();
        new Thread(B ).start();
    }
}
