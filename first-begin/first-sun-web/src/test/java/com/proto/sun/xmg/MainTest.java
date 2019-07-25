package com.proto.sun.xmg;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MainTest {

    private static final long MILLIS_PER_DAY
            = 24 * 60 * 60 * 1000;

    private static final long MICROS_PER_DAY
            = 24 * 60 * 60 * 1000 * 1000;

   /* public static void main(String[] args) {
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }*/


    public static void main(String[] args) {

        /*final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println("Animals are equal: "+ pig == dog);

        System.out.println("Animals are equal: "+ pig.equals(dog) );*/

        Set<Short> set=new HashSet<Short>();
        for(short i=0;i<100;i++){
            set.add(i);
            set.remove(i-1);
        }
        System.out.println(set.size());
    }

    @Test
    public void test() {

    }
}
