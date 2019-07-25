package com.proto.sun.keywords;

public class ThreadA implements Runnable {
    private VolatileSample vs;

    public ThreadA(VolatileSample vs) {
        this.vs=vs;
    }


    @Override
    public void run() {

        System.out.println("ThreadA运行中  : ");
        // VolatileSample vs = new VolatileSample();
        vs.set();
    }
}
