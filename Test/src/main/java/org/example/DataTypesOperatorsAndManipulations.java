package org.example;

public class DataTypesOperatorsAndManipulations {
    public static void main(String[] args) {

        //different types of data...
        short a=1000;
        int b=1234567891;
        long c=1234567890;
        float d=23.124567890f;
        double e=23.124567890123456789012345678901234567890;
        boolean f=false;
        String g="welcome";
        char h='A';


        System.out.println(" Short Value: "+a+"\n Integer Value: "+b+"\n Long Value: "+c+"\n Float Value: "+d+"\n Double Value: "+e+"\n Boolean Value: "+f+"\n String: "+g+"\n Character: "+h);
 
        //type casting
        System.out.println("Integer value of "+b+" been casted to Short value as "+(short)b+"\n Integer value of "+c+" been casted to Short value as "+(short)c);

        //wrapper classes and manipulations
        Integer x1;
        Short y1=5;
        Float z1=7897867567.12398721367613867123871638f;
        Double a1=868698687687687685785686.46768657574864487464874747445;

        x1= Integer.valueOf(y1);
        System.out.println("\nInteger value of "+y1+" is "+x1);

        System.out.println(y1+"'s byte value is "+y1.byteValue());
        System.out.println(y1+"'s hash code is "+y1.hashCode());
        System.out.println(y1+"'s double value is "+y1.doubleValue());
        System.out.println(y1+"'s float value is "+y1.floatValue());
        System.out.println(y1+"'s int value is "+y1.intValue());
        System.out.println(y1+"'s string value is "+y1.toString());
        System.out.println(y1+" and "+x1+" are "+(y1.equals(x1)?"equals to each other":"not equals to each other"));
        System.out.println(y1+" belongs to  "+y1.getClass());




        //different operations
        System.out.println("\n"+a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(b+" / "+a+" = "+(b/a));
        System.out.println(a+" % "+b+" = "+(a%b));
        System.out.println("post increment of "+a+" is "+a++);
        System.out.println("pre increment of "+b+" is "+(++b));
        System.out.println("\n Short hand assignment operations....\n"+(a+=1));
        System.out.println(b-=1.7);
        System.out.println(a*=6);
        System.out.println(b/=8.2);
        System.out.println(a+" is greater than "+b+" : "+(a>b));
        System.out.println(a+" is lesser than "+b+" : "+(a<b));
        System.out.println(a+" is greater than or equals to "+b+" : "+(a>=b));
        System.out.println(a+" is lesser than or equals to "+b+" : "+(a<=b));
        System.out.println(a+" is not equals to "+b+" : "+(a!=b));
        System.out.println(a+" is equals to "+b+" : "+(a==b));
        System.out.println(a+" AND "+b+" : "+(a&b));
        System.out.println(a+" OR "+b+" : "+(a|b));
        System.out.println(a>b?a:b);
    }
}
