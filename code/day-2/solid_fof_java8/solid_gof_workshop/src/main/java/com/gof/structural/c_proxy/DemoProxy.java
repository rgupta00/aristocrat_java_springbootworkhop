package com.gof.structural.c_proxy;

public class DemoProxy {
    public static void main(String[] args) {
        Magician magician=new MagicianProxy();
        magician.doMagic();
    }
}
