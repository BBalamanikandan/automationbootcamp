package org.sample.java;

public class Stat {
    public static String testAge(short age){
        String result;
        switch (age){
            case 0: result="Infant"; break;
            case 1: result="Kid"; break;
            case 2: result="Junior"; break;
            case 3: result="Minor"; break;
            case 4: result="Major"; break;
            case 5: result="Adult"; break;
            case 6: result="Youngster"; break;
            case 7: result="Middle"; break;
            case 8: result="Senior"; break;
            default: result="Not a Number"; break;
        }
        return result;
    }

    public static short getChoice(short age){
        short choice = -1;
        if(age==0 || age==1)
            choice=0;
        else if (age>1&&age<=6)
            choice=1;
        else if (age>6&&age<=10)
            choice=2;
        else if (age>10&&age<=17)
            choice=3;
        else if (age==18)
            choice=4;
        else if (age>18&&age<=23)
            choice=5;
        else if (age>23&&age<=29)
            choice=6;
        else if (age>29&&age<=59)
            choice=7;
        else if (age>59&&age<199)
            choice=8;
        return choice;
    }

    public static void main(String[] args) {
        short age=-1;

        age=0;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=1;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=3;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=8;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=15;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=18;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=21;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=25;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=31;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=48;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=62;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        age=-23;
        System.out.println("your age is "+age+" and comes under "+ testAge(getChoice(age))+" category");

        short n=5;
        System.out.println("\n\nWhile loop with break...");
        while(n>0){
            System.out.println(n);
            if(n==3)
                break;
            n-=1;
        }

        System.out.println("\n\ndo-while loop with continue...");
        n=10;
        do{
            System.out.println(n);
            n-=1;
            if(n==3)
                continue;
        }while (n>0);

        System.out.println("\n\nfor loop");
        n=7;
        for(;n>0;n--){
            System.out.println(n);
        }

        short[] no={10,365,30,89,56,4685,20,40,50};

        System.out.println("\n\nfor-each loop...");
        for(int x:no){
            if(x%10!=0)
                continue;
            else
                System.out.println(x);
        }

    }
}
