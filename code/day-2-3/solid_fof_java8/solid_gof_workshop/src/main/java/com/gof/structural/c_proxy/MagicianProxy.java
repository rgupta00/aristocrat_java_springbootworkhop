package com.gof.structural.c_proxy;
//static proxy ! there are some framework that can produced
//dynamic proxy using java ref, byte code manipulation => AspectJ AOP
public class MagicianProxy extends Magician{

    private Audiance audiance=new Audiance();

    public void doMagic(){
        super.doMagic();
        audiance.clapping();
    }
}
