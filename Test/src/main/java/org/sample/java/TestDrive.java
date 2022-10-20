package org.sample.java;

public class TestDrive {
    public static void main(String[] args) {
        //instantiation and method callings...
        BMW c1=new BMW();
        c1.drive();
        c1.protect();
        c1.start();
        c1.stop();

        Nano c2=new Nano();
        c2.drive();
        c2.deprecated();

        //order of method calling
        c2.drive();
        c1.drive();


    }
}
