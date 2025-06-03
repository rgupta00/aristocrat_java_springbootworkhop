package com.gof.structural.c_aop;

import com.gof.structural.c_proxy.MagicianProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoProxy {
    public static void main(String[] args) {

        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(AopConfig.class);
        Magician magician= (Magician) ctx.getBean("m");
        magician.doMagic();
        magician.eat();
    }
}
