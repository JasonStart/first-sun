package com.proto.sun.keywords;

public class ThreadB implements Runnable {

    private VolatileSample vs;

    public ThreadB(VolatileSample vs) {
        this.vs=vs;
    }

    @Override
    public void run() {

        System.out.println("ThreadB运行中  : ");
        // VolatileSample vs = new VolatileSample();
        vs.loop();

    }
}
