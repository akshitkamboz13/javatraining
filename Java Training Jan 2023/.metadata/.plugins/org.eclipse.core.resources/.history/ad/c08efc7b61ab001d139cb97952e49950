package Java.Training.OOPS.a_jan;

import java.util.Scanner;

public class Training17_factotial_by_function
{
    /* using void return type:
    void fact(int x)
    {
        int fac = 1;
        for (int i =1; i<=x; i++)
        {
            fac = fac*i;
        }
        System.out.println("Factorial of " + x + " is " + fac);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Training17_factotial_by_function obj = new Training17_factotial_by_function();
        obj.fact(num);
    }

     */

    // Factorial of a single num:
    /*
    int fact(int x)
    {
        int fac = 1;
        for (int i =1; i<=x; i++)
        {
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Training17_factotial_by_function obj = new Training17_factotial_by_function();
        int ans = obj.fact(num);
        System.out.println("Factorial of " + num + " is " + ans);
    }

     */

    // Sum of factorial of multiple numbers:

    int fact(int x)
    {
        int fac = 1;
        for (int i =1; i<=x; i++)
        {
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Training17_factotial_by_function obj = new Training17_factotial_by_function();
        int sum = 0;
        for (int i =1; i<=num; i++)
        {
            int ans = obj.fact(i);
            System.out.println("Factorial of " + i+ " is " + ans);
            sum = sum + ans;
        }
        System.out.println("\nSum of all factorials is: " + sum);

    }

}
