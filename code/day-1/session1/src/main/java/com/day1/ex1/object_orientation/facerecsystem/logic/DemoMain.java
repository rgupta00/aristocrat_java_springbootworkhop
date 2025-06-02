package com.day1.ex1.object_orientation.facerecsystem.logic;


import com.day1.ex1.object_orientation.facerecsystem.db.Face;

public class DemoMain {
    public static void main(String[] args) {

        //Date: util =>90
        //Date : sql =>10

        MyClass myClass=new MyClass();

        Face face = new Face();
        face.saveFacePixelToDb();


    }
}
