package com.day1.ex2.object_orientation2.empmgtapp;

public class PayementProcessing {
    public static void processPayment(Payable payable){
        //store in db
        System.out.println(payable.getPayement());
    }
}
