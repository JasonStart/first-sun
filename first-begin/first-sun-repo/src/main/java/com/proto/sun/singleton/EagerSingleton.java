package com.proto.sun.singleton;

/**
 * 单例模式(Singleton Pattern)：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，
 * 它提供全局访问的方法。单例模式是一种对象创建型模式。
 */
public class EagerSingleton {
    
    //饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
    // private static EagerSingleton instance = new EagerSingleton();
    private static EagerSingleton instance = new EagerSingleton();
    
    /**
     * 私有默认构造子
     */
    // private EagerSingleton(){}
    private EagerSingleton(){};
    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance(){
        return instance;
    }

}
