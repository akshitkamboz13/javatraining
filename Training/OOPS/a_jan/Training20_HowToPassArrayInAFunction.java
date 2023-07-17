package Java.Training.OOPS.a_jan;

import java.util.Scanner;

public class Training20_HowToPassArrayInAFunction
{
    // print the numbers in the array whose sum of digits is not a prime number:
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter the elements: ");
        for (int i =0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Training20_HowToPassArrayInAFunction obj = new Training20_HowToPassArrayInAFunction();
        System.out.println("Numbers whose sum of digits is not prime: ");
        int grr[ ] = obj.fun(arr);
        for (int i =0; i< obj.k; i++)
        {
            System.out.println(grr[i]);
        }

    }


    int k=0;

    int[] fun(int brr[])
    {
        int crr[]= new int[brr.length];
        for (int i = 0; i<brr.length; i++)
        {
            int sum = digitSum(brr[i]);
            boolean ans = prime(sum);
            if (ans == false)
            {
                crr[k++]= brr[i];
            }
        }
        return crr;
    }

    int digitSum(int x)
    {
        int sum = 0;
        for (int i = x; i>0; i=i/10)
        {
            sum = sum +(i%10);
        }
        return sum;
    }

    boolean prime (int y)
    {
        int count = 0;
        for (int i = 1; i<=y; i++)
        {
            if (y%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return true;
        }
        return false;
    }

}
