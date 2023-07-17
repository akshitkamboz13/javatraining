package Java.Training.Basics;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.*; //isme neeche wali donu aayengi libraries
//import java.util.Scanner;
//import java.util.Arrays;

public class Training11Array2

{
    public static void main(String[] args)

    {
        //Q Linear search:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");

        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int count  = 0;
        int item = sc.nextInt();
        for (int j = 0; j<arr.length; j++)
        {
            if (item == arr[j])
            {
                count++;
                System.out.println("Item found on index: " + j);
                break;
            }

        }
        if (count==0)
        {
            System.out.println("Not found");
        }
         */

        //Q Binary search:

        /*Complexity of merge and binary: log n

         array   11 22 33 44 55 66 77
         index    0  1  2  3  4  5  6
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The array after sorting is: ");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print (arr[i] + " ");
        }
        int beg = 0, end = arr.length-1, mid = arr.length/2;
        System.out.println("\nEnter the element to be searched: ");
        int item = sc.nextInt();
        int count = 0;

       // while(beg<=end)
       // {
       //     if (item==arr[mid])
       //     {
       //         count++;
       //         System.out.println("Item found");
       //         break;
       //     }
       //     if (item>arr[mid])
       //     {
       //         beg = mid + 1;
       //     }
       //     else
       //     {
       //         end = mid -1;
       //     }
       //     mid = (beg+end)/2;
       // }

       // if (count==0)
       // {
       //     System.out.println("Item not found");
       // }

//1   8    7    4   3
//1   3    4    7   8
        for (int i = beg; i <=end; ) // i++ aghr krenge toh index 1 pr not found dikhayega
        {
            if (item==arr[mid])
            {
                count++;
                System.out.println("Item found on index: " + mid); //agar bada number pehle hi dalenge to sort hoga woh pehle.
                break;
            }
            if (item>arr[mid])
            {
                beg = mid + 1;
            }
            else
            {
                end = mid -1;
            }
            mid = (beg+end)/2;

        }

        if (count==0)
        {
            System.out.println("Item not found.");
        }

         */

        //Q We have an array of integers, we have to split them in two, one containing odd numbers and  other even

        /*


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        int arrOdd[] = new int [size];

        int arrEven[] = new int [size];

        int countEven =0, countOdd=0;

        System.out.println("Enter the elements: ");

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of array are: ");

        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i]%2 ==0)
            {
                arrEven[countEven]=arr[i];
                countEven++;
            }
            else
            {
                arrOdd[countOdd]=arr[i];
                countOdd++;
            }
        }

        System.out.println("Even elements: ");

        for (int j = 0; j<countEven; j++)
        {
            System.out.print(arrEven[j] + " ");
        }

        System.out.println("\nOdd elements: ");

        for (int j = 0; j<countOdd; j++)
        {
            System.out.print(arrOdd[j] + " ");
        }

         */

        //Q Merge sort:

        //Q Rotation 1:
        /*
        11 22 33 44 55
        22 33 44 55 11
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");

        for (int i=0; i<arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }

        int temp = arr[0];
        System.out.println("Elements are: ");

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nElements after rotation: ");

        for (int i = 0; i< arr.length-1; i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;

        for (int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

         */

        //Q Rotation2:
        /*
        11 22 33 44 55
        44 55 11 22 33
         */

        //Q Rotation2:
        /*
        11 22 33 44 55
        55 11 22 33 44

                 */

        //Q Insert the element in an array:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];

        System.out.println("Enter the elements: ");
        for (int i =0; i<size; i++)     // size liya arr.length k badle kyunki 5 hi value chahiye
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the new element: ");

        int item = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        for(int i = size-1; i>=pos; i--)
        {
            arr[i+1]=arr[i];        //11 22 33 44 55  _
        }                           // 0  1  2  3  4  5
                                    //             i

        arr[pos]= item;
        for (int i = 0; i <arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}


























