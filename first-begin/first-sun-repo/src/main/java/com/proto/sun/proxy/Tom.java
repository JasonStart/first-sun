package com.proto.sun.proxy;

/**
 * Tom是个程序猿,出差想买一张高铁票
 */
public class Tom implements Person {

    public void writeCode(){
        System.out.println("Tom是个程序猿，会写代码！");
    }

    @Override
    public void buyTicket() {
        System.out.println("Tom要的买高铁票！");
    }
}
