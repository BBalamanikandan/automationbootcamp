package org.example;

public class TestDrive {
    public static void main(String[] args) {
        BMW c1=new BMW();
        c1.drive();
        c1.protect();

        Nano c2=new Nano();
        c2.drive();

        c2.drive();
        c1.drive();


    }
}
