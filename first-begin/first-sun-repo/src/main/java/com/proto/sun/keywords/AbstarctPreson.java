package com.proto.sun.keywords;

import com.proto.sun.proxy.Moveable;

public abstract class AbstarctPreson implements Moveable {

    public abstract void dirnk();

    @Override
    public void move() throws Exception {
        System.out.println("跑步健身，好习惯。");
    }
}
