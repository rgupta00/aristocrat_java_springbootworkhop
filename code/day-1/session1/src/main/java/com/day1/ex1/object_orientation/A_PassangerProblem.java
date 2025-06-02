package com.day1.ex1.object_orientation;
//loose coupling and high cohesion
//a passanger named vijay is moving from laxmi nagar to ITO using metro
class Passanger  {
    private String name;
    public Passanger(String name){
        this.name=name;
    }
   public void travel(String source, String destination, Car car){
       car.move(source,destination);
   }
}
class Car {
    public void move(String source, String destination){
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using car");
    }
}


public class A_PassangerProblem {
    public static void main(String[] args) {
        //Metro metro=new Metro();
        Car car=new Car();
        Passanger vijay=new Passanger("vijay");
        vijay.travel("Banaggatta","btm",car);
    }
}
