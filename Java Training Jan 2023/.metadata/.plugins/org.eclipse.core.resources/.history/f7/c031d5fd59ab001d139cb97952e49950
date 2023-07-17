package Java.Training.Basics;

import java.util.Scanner;

public class Training06 {
    public static void main(String[] args) {
/*
        //Q: HCF
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int small = a < b ? a:b;

        for (int hcf = small; hcf >=1; hcf--)
        {
            if(a%hcf==0 && b%hcf==0)
            {
                System.out.println(hcf);
                break;
            }
        }



// HCF
// 4:  6:           5:  7:              1:  5:

// 1   1            1   1(HCF)          1   1(HCF)
// 2   2(HCF)       5   7                   5
// 4   3
//     6
*/

        // Q: Fabonacci sequence
/*
        //0 1 1 2 3 5 8 13 .........
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        long a = 0, b = 1;
        System.out.println(a+ " " +b + " ");

        //a  b  c
        //0  1  1  2  3  5  8  13 .........
        //   a  b

        // hame abh a mai b ka value daal na hai, usme lekin hame dyaan rkhna hoga ki = k right kya rkhna h aur left mai kya rkhna h. kyunki aghr x = 8 hai fir 8 x mai ja ta hai x 8 m nahi.

        for (int i = 0; i < n; i++)
        {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
*/
        // Q: ArmstrongNumber
        // Digits in a number raised to the power of number of digit in that number, take sum.
        // 152= 1*1*1 + 5*5*5 + 3*3*3
        //eg: 370, 1634, etc
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int t = num;
        int power=0;                            //yeh use hoga count nikaal ne k  liye jo fir power k liye use hoga.
        int sum = 0;
        for (int i=num; i >0; i = i/10)
        {
            power++;
        }
       // System.out.println(power);

        for (int i=num; i>0;)
        {
            int digit = i%10;
            i=i/10;
            sum = sum +(int)Math.pow(digit,power);

        }
       // System.out.println(sum);
        if (sum == t)
        {
            System.out.println("armstrong");
        }
*/

        //Q: Strong number

        //145= 1!+4!+5!
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;


        for (int i=num; i>0;i = i/10 )
        {
            int lastdigit = i %10;

            // i = i/10;  decrement ka code ham yahan b le skhte h aur for k andr b, kyunki pehle code chalega fir yeh decrement hoga.

            int fac = 1;

            for (int j=lastdigit; j>=1; j--)
            {

                fac = fac*j;

            }
            //System.out.println(fac);
            sum = sum + fac;

        }
        if (sum==num)
        {
            System.out.println("It is a Strong number");
        }
        else
        {
            System.out.println("It is not a strong number");
        }
*/
        // Q: Automorphic

        // 5*5=25 => automorphic
        // 6*6=36 => automorphic
        // 9*9=81 => not automorphic
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int c=0;

        for (int i=num; i>0; i=i/10)
        {
            c++;
        }

        System.out.println("no. of digits in our number: " + c);
        int sq = (int)Math.pow(10,c);
        int sq2 = (int)Math.pow(num,2);
        if (sq2%sq==num)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
        */


        // Q: To make all multiplication table among given two numbers.
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        System.out.println("Enter the number 2: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mul=1;

        for (int num = num1; num<=num2; num++)
        {
            for (int i = 1; i <= 10; i++) {
                mul = num * i;
                System.out.println(num + "*" + i + "=" + mul);
            }
            System.out.println(" ");
        }
*/
        // Q: factorial of all the numbers among given two numbers.
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = sc.nextInt();


        for(int num = num1; num<=num2; num++)
        {
            int fac=1;
            for (int i = num; i > 0; i--)
            {
                fac = i * fac;
            }
            System.out.println("Factorial of " + num + " is " + fac);

        }
*/

        // Q: All prime numbers among two given numbers
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextByte();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Prime numbers are");



        for (int num = num1; num <= num2; num++)
        {
            int c=0;

            for (int i=num; i>=1; i--)
            {

                if (num%i==0)
                {
                    c++;  // c will count the number of factors
                }

            }
                 if (c==2)
               {
                    System.out.println(num);
              }

        }

 */
        // Q: Kaprekar number
        // 45*45 = 2025
        //         20 25
        //         20+25 = 45
        //                 45 = Kaprekar number

        // 13*13 = 169
        //         1 69  or  16 9
        //         1+69  or  16+9
        //         70    or  25
        // donu possibilities check krni h.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sqr= num*num;
        int digits=0;
        for (int i=sqr; i>0; i=i/10)
        {
            digits++;
        }
        //for even number of digits in sqr
        if(digits%2==0)

        {
            int last = sqr%(int)Math.pow(10,(digits/2));
            int first = sqr/(int)Math.pow(10,(digits/2));

            if (last+first==num)
            {
                System.out.println("Kaprekar Number");
            }
            else
            {
                System.out.println("Not Kaprekar Number");
            }

        }
        //for odd number of digits in sqr
        else
        {
            int last = sqr%(int)Math.pow(10,(digits/2)+1);//  12 345
            int first = sqr/(int)Math.pow(10,(digits/2)+1);// 12 345

            int last2 = sqr%(int)Math.pow(10,(digits/2));
            int first2 = sqr/(int)Math.pow(10,(digits/2));

            if (last+first==num || last2+first2==num)
            {
                System.out.println("Kaprekar Number");
            }
            else
            {
                System.out.println("Not Kaprekar Number");
            }

        }




    }
}
