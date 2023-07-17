package Java.Training.OOPS.feb10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class t2_unique
{
    void fun (String str)
    {
        String arr[] = str.split(" ");
        Arrays.sort(arr);
        int count = 1, i;
        for ( i = 0; i < arr.length-1; i++)
        {
            if (arr[i].equals(arr[i+1])) // arr[i] == arr[i+1] nahi use krna hai
            {
                count++;
            }
            if (!arr[i].equals(arr[i+1]))
            {
                if (count==1)
                {
                    System.out.println(arr[i]);
                }
                count=1;
            }

        }
        if (count==1)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args)
    {
        String str = "I love football because I love sports";
        t2_unique obj = new t2_unique();
        obj.fun(str);

    }
}
