package Java.Training.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Training12Array3
{
    public static void main(String[] args)
    {
        // Print the prime numbers from the array
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");

        for (int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Prime numbers in the array are: ");

        for (int i=0; i< arr.length;i++)
        {
            int count=0;
            for (int j = arr[i]; j>0 ;j-- )
            {
                if (arr[i]%j==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.println(arr[i]);
            }
        }

         */

        // Print only pallindrome numbers from the array:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");

        for (int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Pallindrome numbers are: ");
        //1221

        for(int i = 0; i < arr.length; i++)
        {
            int rev = 0;
            for(int j = arr[i]; j>0; )
            {
                int last = j%10;
                j=j/10;
                rev = rev*10 + last;
            }

            if(rev==arr[i])
            {
                System.out.println(rev);
            }
        }
        */

        // Print the element in the array if the sum of its digits is a prime number:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");

        for (int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("The element is: ");


        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            for(int j = arr[i]; j>0; )
            {
                int last = j % 10;
                j = j / 10;
                sum = sum+last;
            }

            int count=0;
            for (int z = sum; z>0; z--)
            {
                if (sum % z==0)
                {
                   count++;
                }

            }
            if (count==2)
            {
                System.out.println(arr[i]);
            }

        }

         */

        //Bubble sort:
        /*
        //ek element leke us se sab ko compare krenge
        //phase1:
        // 9   8   8   8
        // 8   9   7   7
        // 7   7   9   6
        // 6   6   6   9        //9 apni jagah pr puhamch gaya

        //phase2:
        // 8   7   7
        // 7   8   6
        // 6   6   8
        // 9   9   9            // 8 b aonu jagah aaya

        // phase 3: last


        //if you have n elements you will have n-1 phase (steps
        // n-1=arr.length-1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");

        for (int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i<arr.length-1; i++) //n-1 => phases
        {
            int count=0;

            for(int j = 0; j< arr.length-1; j++) //comparison
            {
                if (arr[j]>arr[j+1])
                {
                    count++;
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            if (count==0)
            {
                System.out.println("The code ran " + i + " times");
                break;
            }
        }
        System.out.println("After sorting: ");
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

         */

        //Selection sort:
        /*
        //pehle element ko chord k bakiyu m se chorta dhund na h
        // fir us chorte ko pehle se compare krna h
        // 4 7 3 1 2 5  // given array
        // 1 7 3 4 2 5
        // 1 2 3 4 7 5
        // 1 2 3 4 7 5
        // 1 2 3 4 5 7

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of array: ");

        for (int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<arr.length; i++)
        {
            int min = i;
            for ( int j = i+1; j< arr.length ; j++)
            {
                if (arr[min] > arr[j])
                {
                    min = j;
                }
            }

            if (min != i)
            {
                int t = arr[min];
                arr[min] = arr[i];
                arr[i] = t;
            }

            System.out.print(arr[i] + " ");
        }

         */

        //Insertion sort:
        /*
        int arr[] = {4, 3, 5, 1, 7, 2};
        for (int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && key < arr[j])        //(key < arr[j] && j>=0)
            {
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;

        }
        System.out.println("After sorting: ");

        for (int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

         */

        //Unique number:

        /*
        int arr[] = {3,7,2,3,2,5,3};
        for (int i=0; i<arr.length; i++)
        {
            int c =0;
            for (int j = 0; j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    c++;
                }
            }
            if (c==1)
            {
                System.out.println(arr[i]);
            }
        }

         */

        //Frequency:
        /*
                {3,  7,  2, 3,  2,  5, 3}
        Step 0:{-1, -1, -1,-1, -1, -1,-1}
        Step 1: {3, -1, -1, 0, -1, -1, 0} //first 3 ki turn
        Step 2: {3,  1, -1, 0, -1, -1, 0} //7 ki turn
        Step 3: {3,  1,  2, 0,  0, -1, 0} //first 2 ki turn
        Step 4: {3,  1,  2, 0,  0, -1, 0} //second 3 ki turn
        Step 5: {3,  1,  2, 0,  0, -1, 0} //second 2 ki turn
        Step 6: {3,  1,  2, 0,  0,  1, 0} //5 ki turn
        Step 7: {3,  1,  2, 0,  0,  1, 0} //teesre 3 ki turn

        */
        int arr []={3, 7, 2, 3, 2, 5, 3};
        int f[] = {-1, -1, -1, -1, -1, -1, -1};
        for (int i = 0; i < arr.length; i++)
        {
            int count =1;

            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    f[j]= 0;
                }
            }

            if (f[i] !=0)
            {
                f[i]=count;
            }

        }
        System.out.println("Frequency: ");
        for (int i=0; i<arr.length; i++)
        {
            if(f[i]!=0)
                System.out.println("The count of " + arr[i] + " is " + f[i]);
        }

    }
}
