package com.proto.sun.singleton;

public class InnerClassSingleton {

    private InnerClassSingleton(){}

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder {
        // 静态初始化器，由JVM来保证线程安全
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public void singletonOperation(){
        //功能处理
        System.out.println("类级的内部类Singleton的方法。");
    }
}
