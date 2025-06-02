package com.day1.ex3.ex_handling;

class MEx extends Exception{}

class NEx extends Exception{}

class OEx extends NEx{}

public class DemoExHandlingJava7 {
    public static void main(String[] args) {
        try{
            if(1==1)
            throw new MEx();

            if(1==1)
                throw new NEx();
            if(1==1)
                throw new OEx();
        }catch (OEx e){
            System.out.println(e);
        }
        catch (MEx | NEx  e){
            System.out.println(e);
        }

    }
}
