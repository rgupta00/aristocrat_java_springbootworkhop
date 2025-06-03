package com.gof.creational.a_singleton_pattern;
/*
	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum

 */
class SingletonObject implements Cloneable{

    private volatile static SingletonObject singletonObject;

    private SingletonObject() {
        System.out.println("SingletonObject created");
    }
//double lock cheking in singleton *

    public static  SingletonObject getSingletonObject() {
        if (singletonObject == null) { // First check (no locking)
            synchronized (SingletonObject.class) {
                if (singletonObject == null) { // Second check (with locking)
                    singletonObject = new SingletonObject();
                }
            }
        }

        return singletonObject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonObject;
    }
}
public class DemoSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonObject singletonObject = SingletonObject.getSingletonObject();
        SingletonObject singletonObject2 = SingletonObject.getSingletonObject();


        SingletonObject singletonObject3= (SingletonObject) singletonObject.clone();

        System.out.println(singletonObject == singletonObject3);
    //java reflection can break singleton
        //clonning
        //serilization
        //multithreading
        //class loading
        //diff to impl
    }
}
