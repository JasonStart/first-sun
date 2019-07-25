package com.proto.sun.singleton;


public class LazySingleton {
    
    private static LazySingleton instance = null;
    /**
     * 私有默认构造子
     */
    private LazySingleton(){}
    /**
     * 静态工厂方法
     */
    public static synchronized LazySingleton getInstance(){
        
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    
    public void today(){
        System.out.println("今天是一个晴天！");
    }
}
