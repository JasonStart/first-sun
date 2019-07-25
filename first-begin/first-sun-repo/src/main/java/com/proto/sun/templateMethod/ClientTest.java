package com.proto.sun.templateMethod;

public class ClientTest {

    public static void main(String[] args) {

        HummerModel h1 = new HummerH1();
        h1.run();

        HummerModel h2 = new HummerH2();
        h2.run();

    }
}
