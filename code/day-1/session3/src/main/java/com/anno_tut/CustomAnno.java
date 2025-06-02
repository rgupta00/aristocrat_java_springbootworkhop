package com.anno_tut;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Step 1: create the anno
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    public String message() default "hello";
}

//2 u use that anno
class MyDemo{
    @MyAnn(message = "i was applied")
    void foo(){
        System.out.println("foo method ...");
    }
}
//3. u have to process that annotation, using "java reflection"
public class CustomAnno {
    public static void main(String[] args)throws ClassNotFoundException {

       Class<?> clazz=Class.forName("com.anno_tut.MyDemo");
       Method[] methods=clazz.getDeclaredMethods();
       for(Method m:methods){
           if(m.isAnnotationPresent(MyAnn.class)){
               MyAnn anno=m.getAnnotation(MyAnn.class);
               System.out.println(anno.message());
           }
       }
    }
}
