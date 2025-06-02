package com.anno_tut;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton{
    private Singleton(){
        System.out.println("dare to call me!");
    }
    private void foof(){

    }
    public void doWork(){
        System.out.println("doing work...");
    }
}
public class PrivateMethodOrCtr {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> aClass=Class.forName("com.anno_tut.Singleton");
        Constructor[] constructors=aClass.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        Singleton singleton=(Singleton) constructors[0].newInstance();
        singleton.doWork();
    }
}
