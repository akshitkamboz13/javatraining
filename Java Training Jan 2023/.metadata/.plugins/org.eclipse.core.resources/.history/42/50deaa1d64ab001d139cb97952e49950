package Java.Training.OOPS.feb3;

import java.util.Scanner;

public class swap_vowels
{
    String fun(String s2)
    {
        char arr[] = s2.toCharArray();
        int q = arr.length;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U')
            {
                for (int j = q-1; j >i; j--)
                {
                    if (arr[j]=='a' || arr[j]=='A' || arr[j]=='e' || arr[j]=='E' || arr[j]=='i' || arr[j]=='I' || arr[j]=='o' || arr[j]=='O' || arr[j]=='u' || arr[j]=='U')
                    {
                        q=j;
                        char temp = arr[i];
                        arr [i] = arr [j];
                        arr [j] = temp;
                        break;
                    }

                }
            }
        }
        s2=String.valueOf(arr);

        return s2;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        swap_vowels obj = new swap_vowels();
        String ans = obj.fun(s);
        System.out.println(ans);
    }
}
