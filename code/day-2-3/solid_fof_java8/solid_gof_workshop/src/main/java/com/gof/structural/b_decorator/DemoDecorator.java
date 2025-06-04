package com.gof.structural.b_decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoDecorator {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("test.txt")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
