package com.day1.ex1.object_orientation;

class Shape{
    void draw(){
        System.out.println("drawing a shape");
    }
}
class Circle extends Shape{

    @Override// annotataion
    void draw(){
        System.out.println("drawing a circle");
    }
}
public class D_RuntimePoly {
    public static void main(String[] args) {
      Shape shape=new Circle();
      shape.draw();
    }
}
