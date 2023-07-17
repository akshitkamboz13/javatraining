package Java.Training.OOPS.feb10;

import java.util.Scanner;

public class t8_indexoutofbound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        try
        {
            int r = sc.nextInt();
            if(r>arr.length-1)
            {
                throw new Exception("Out of bounds");
            }
            System.out.println(arr[r]);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
