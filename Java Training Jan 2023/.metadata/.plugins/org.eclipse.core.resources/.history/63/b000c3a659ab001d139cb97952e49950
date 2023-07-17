package Java.Training.Basics;

import java.util.Scanner;

public class Training05Assignment01 {
    public static void main(String[] args) {
        //Q1: to print all natural numbers from 1 to n
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1 ; i<=1; i++)
        {
            System.out.println(i);
        }
*/

        //Q2: to print all natural numbers from n to 1
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = n ; i>=1; i--)
        {
            System.out.println(i);
        }
*/

        //Q3: to print alphabet from a to z.
        /*
        ASCII code is different for A and a and same goes for other alphabets,

        ASCII Codes:
        a= 97    A= 65
        b= 98    B= 66
        .        .
        .        .
        .        .
        z= 122   Z= 90

        the belove two lines of code helped us to find the ASCII code
        char ch = 'a', ch2 = 'z';
        System.out.println((int)ch + " " + (int)ch2);

        main code for the given question:

        for (int i = 97; i<=122; i++)
        {
            System.out.print((char) i + " ");
        }

         */

        //Q4: yo print even numbers from 1 to n
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int c=0;
        for (int i=1; i<=n; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
                c++;
            }
        }
        System.out.println("No. of even numbers between them are " + c);

 */

        //Q5: odd
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int c=0;
        for (int i=1; i<=n; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
                c++;
            }
        }
        System.out.println("No. of odd numbers between them are " + c);

 */

        //Q6: sum of all even numbers from 1 to n
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++)
        {
            if (i%2==0)
            {
                sum = sum + i;

            }
        }
        System.out.println(sum);

 */
        //Q7 Multiplication Table:
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int A=1;
        for(int i=1; i<=10; i++)
        {
            A=n*i;
            System.out.println(n + " * " + i + " = " + A);
        }
*/

        //Q8: Program to count number of digits in a number
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        long d = sc.nextLong();
        int c=0;

        //for (long i=d; i>=1; i=i/10)

        //{
        //     c++;
        //}


        while(d>0)
        {
            d = d / 10;
            c++;
        }
        System.out.println(c);

*/
        //Q9 Sum of digits in a number {INCOMPLETE}
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int c=0;
        int sum = 0;

        for (int i = a; i > 0; i=i/10)
        {
            c = i%10;
            sum = c+sum;
        }
        System.out.println(sum);
    */

        //Q10 swap the first and last digits of the number
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int count = 0;
        int t = num;
        int extraT = num; //print karane k liye same number aana chahiye, tabhi isme b store kiya.

        int last = num % 10;
        System.out.println("Last digit of " + extraT + " is " + last);

        while (num>=10)
        {
            num = num/10;
            count++;
        }

        int first = num;
        System.out.println("First digit of " + extraT + " is " + first);

        t = t / 10;
        int mid = t % (int)Math.pow(10, count-1);
        System.out.println("Mid section of " + extraT + " is " + mid);

        System.out.println("New number is: " + (int) (last*Math.pow(10, count) + mid*Math.pow(10, count-2) + first));
        // System.out.println("New number is: " + last*(int)Math.pow(10, count) + mid*(int)Math.pow(10, count-2) + first);
*/


        //Q11 LCM

        int a = 4, b = 6;
        int big = a > b ? a : b;

        for (int lcm = big; lcm <=a*b; lcm++)
        {
            if (lcm % a == 0 && lcm % b == 0)               // confusion: i%a kyu a%i kyu nahi
            {
                System.out.println(lcm);
                break;
            }
        }



    }
}
