package Java.Training.OOPS.feb3;

import java.util.Arrays;
import java.util.Scanner;

public class anagram
{
    boolean fun ( String str1, String str2)
    {
        if (str1.length() == str2.length())
        {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2))
            {
                return true;
            }
            return false;

            /* ek aur tareeqa: line 16 se 20 tak k badle
            str1 = String.valueOf(arr1);
            str2 = String.valueOf(arr2);
            if (str1.equals(str2))
            {
                return true;
            }
            return false;
             */

        }

        return false;
    }

    public static void main(String[] args)
    {
        String s1 = "listen";
        String s2 = "silent";

        anagram obj = new anagram();
        if (obj.fun(s1,s2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}


