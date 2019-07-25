package com.proto.sun.singleton;

public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private static DoubleCheckSingleton getInstance() {
        // 第一重 check
        if ( doubleCheckSingleton == null) {
            // 同步代码块
            synchronized (DoubleCheckSingleton.class) {
                // 第二重 check
                if (doubleCheckSingleton == null) {
                    // 创建实例
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
