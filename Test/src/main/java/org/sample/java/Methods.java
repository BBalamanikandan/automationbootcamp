package org.sample.java;

public class Methods {

    //method overloading
    public static short sumOfThreeNumbers(short x, short y, short z){
        return (short) (x+y+z);
    }

    public static int sumOfThreeNumbers(int a,int b,int c){
        return a+b+c;
    }

    public static long sumOfThreeNumbers(long l,long m,long n){
        return l+m+n;
    }
    public static void biggestAmongNumbers(short x, short y, short z) {
        if (x > y && x > z) //if-else-if
            System.out.println("Among " + x + ", " + y + ", " + z + " the biggest number is " + x);
        else if (y > x && y > z)
            System.out.println("Among " + x + ", " + y + ", " + z + " the biggest number is " + y);
        else
            System.out.println("Among " + x + ", " + y + ", " + z + " the biggest number is " + z);
    }
    public static void main(String[] args) {
        short x=10,y=8,z=13;
        int a=100032,b=1234, c=234545;
        long l=234234324,m=235423453,n=345342;

        System.out.println("\n");
        biggestAmongNumbers(x,y,z);
        y=23;
        biggestAmongNumbers(x,y,z);
        x=56;
        biggestAmongNumbers(x,y,z);

        System.out.println("\n\n"+x+" + "+y+" + "+z+" = "+sumOfThreeNumbers(x,y,z));
        System.out.println(a+" + "+b+" + "+c+" = "+sumOfThreeNumbers(a,b,c));
        System.out.println(l+" + "+m+" + "+n+" = "+sumOfThreeNumbers(l,m,n));

    }
}
