package Java.Training.Basics;

import java.util.Scanner;

public class Training15_jagged_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];

        for (int i = 0; i < arr.length; i++) // arr.length rows deta h, matlab arr[3][5] m arr.length 3 dega
        {
            System.out.println("enter the columns in row number " + i+1 );
            int r = sc.nextInt();
            arr[i] = new int[r];
        }
        System.out.println("enter the elements: ");
        for (int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr[i].length; j ++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("elements are: ");
        for (int i = 0; i < arr.length; i ++)
        {
            for (int j = 0; j < arr[i].length; j ++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
