package org.example;

public class Nano implements Drive,Prevention {

    Nano(){
        System.out.println("Nano Car Info been called...");
    }
    public void drive() {
        System.out.println("Nano car only supports manual drive mode");
    }

    public void protect() {

    }
}
