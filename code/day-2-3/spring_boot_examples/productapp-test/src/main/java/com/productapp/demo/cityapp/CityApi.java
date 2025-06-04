package com.productapp.demo.cityapp;

public class CityApi {
    public String getCity(int id){
        try{
            Thread.sleep(800);
        }catch (InterruptedException e){    }
        return "Hyderabad";
    }
}

