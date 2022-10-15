package org.example;

public class Nano implements Drive,Prevention {

    public void deprecated(){ System.out.println("production stopped..."); } //nano's specific method definition

    Nano(){
        System.out.println("Nano Car Info been called...");
    }
    public void drive() {
        System.out.println("Nano car only supports manual drive mode");
    } //nano follows the prototype of drive interface hence as a mandate rule impleted its method.

    public void protect() {} //though nano follows the prevention prototype doesn't support this feature in the car hence empty definition required as prevention interface implemented.

}
