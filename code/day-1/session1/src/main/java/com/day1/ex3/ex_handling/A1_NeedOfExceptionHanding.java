package com.day1.ex3.ex_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A1_NeedOfExceptionHanding {
    public static void main(String[] args) {
        //divide 2 number
           try{
               Scanner scanner = new Scanner(System.in);
               System.out.println("PE numerator");
               int x = scanner.nextInt();

               System.out.println("PE Denominator");
               int y = scanner.nextInt();

               int result = x / y;
               System.out.println(result);


           }catch (InputMismatchException e){
               System.out.println("pls enter ints only");
           }catch (ArithmeticException ex){
               System.out.println("divide by zero");
           }

        System.out.println("done");
    }
}
