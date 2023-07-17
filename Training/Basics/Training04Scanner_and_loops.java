package Java.Training.Basics;

import java.util.*;
//Package : it is a collection of pre defined classes.
//          Two types:
//        i) User defined
//       ii) Pre Defined

public class Training04Scanner_and_loops {
    public static void main(String[] args) {
/*
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = obj.nextInt();
        System.out.println("Integer number is = " + num);
        float b = obj.nextFloat();
        System.out.println("Floating Value is " + b);
        String str = obj.next();
        System.out.println("String1 value is " + str);
*/
        //Reverse of a number
/*
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        //1234
        int a = obj.nextInt();
        int sum = 0;

        while(a>0)
        {
            int r = a % 10;  //Last wala digit hatega
            sum = sum*10 + r; //number system lagana hai
            a = a/10;
        }
        System.out.print(sum);
*/
        /*
        int r;
        r= a % 10;
        System.out.println(r);
        a = a / 10;

        r = a % 10;
        System.out.println(r);
        a = a / 10;

        r = a % 10;
        System.out.println(r);
        a = a / 10;

        r = a % 10;
        System.out.println(r);
        a = a / 10;
        */

        /*while(a>0) //aada hai
        {
            int r = a % 10;
            System.out.print(r);
            a = a/10;
        }
         */

        //Pallindrome

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        //1221
        int a = obj.nextInt();
        int b = a;
        int sum = 0;

        while(a>0)
        {
            int r = a % 10;  //Last wala digit hatega
            sum = sum*10 + r; //number system lagana hai
            a = a/10;
        }
        System.out.println(sum);
        if (b==sum)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }

    }
}
