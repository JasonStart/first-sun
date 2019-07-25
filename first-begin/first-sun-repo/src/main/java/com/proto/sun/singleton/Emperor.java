package com.proto.sun.singleton;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {

    //定义最多能产生的实例数量
    private static  int maxNumOfEmperor = 2;
    //每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<>();
    //定义一个列表，容纳所有皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<>();
    //当前皇帝的序列号
    private static int countNumOfemperor = 0;

    // 产生所有的对象
    static {
        for (int i=0;i< maxNumOfEmperor;i++) {
            emperorList.add(new Emperor("我是皇帝" + (i+1)));
        }
    }

    private Emperor(){

    }
    //传入皇帝名称
    private Emperor(String name) {
        nameList.add(name);
    }

    //随机获得一个皇帝对象
    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfemperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfemperor);
    }

    //皇帝发话了
    public static void say() {
        System.out.println(nameList.get(countNumOfemperor));
    }
}
