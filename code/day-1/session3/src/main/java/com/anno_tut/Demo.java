package com.anno_tut;

import java.util.LinkedList;
import java.util.List;

class Foo1{
    void foo(){
        System.out.println("foo method ");
    }
    @Deprecated
    @SuppressWarnings({"rawtypes","unchecked"})
    void oldLogic(){
        List list=new LinkedList();
        list.add("foo");
    }
}
class Bar1 extends Foo1{
    @Override
    void foo(){
        System.out.println("bar method ");
    }
}
public class Demo {
    public static void main(String[] args) {
       //what is annotaiton? aka meta data ie data about data
        Foo1 f=new Bar1();
        f.foo();
        f.oldLogic();
    }
}
