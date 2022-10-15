package org.example;

public class BMW implements Drive,Prevention{

    BMW(){
        System.out.println("BMW Car Info been called...");
    }

    public void drive() {
        System.out.println("BMW supports auto-pilot drive mode");
    }

    public void protect() {
        System.out.println("BMW has injury prevention system to blow an air bag immediately as and when get crash");
    }
}
