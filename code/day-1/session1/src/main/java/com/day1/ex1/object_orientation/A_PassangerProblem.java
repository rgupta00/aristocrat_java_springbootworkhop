package com.day1.ex1.object_orientation;
//loose coupling and high cohesion
//a passanger named vijay is moving from laxmi nagar to ITO using metro
//abstraction: focus on essential things
//          abs class vs interface ****

interface Vehicle{
    void move(String source, String destination);
}

class Passanger  {
    private String name;
    public Passanger(String name){
        this.name=name;
    }
    //use a relationship
   public void travel(String source, String destination, Vehicle vehicle){
       vehicle.move(source,destination);
   }
}
class Metro implements Vehicle {
    @Override
    public void move(String source, String destination) {
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using metro");
    }
}
class Car implements Vehicle {
    @Override
    public void move(String source, String destination) {
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using car");
    }
}

class Bike  implements Vehicle {
    @Override
    public void move(String source, String destination){
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using bike");
    }
}


public class A_PassangerProblem {
    public static void main(String[] args) {
        //Metro metro=new Metro();
       Vehicle vehicle=new Metro();
        Passanger vijay=new Passanger("vijay");
        vijay.travel("LN","ITO",vehicle);
    }
}
