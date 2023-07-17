package Java.Training.OOPS.feb2;

import java.util.Scanner;

public class encryption
{
    String plusminus (String newstr)
    {
        String s = "";
        for (int i = 0; i<newstr.length(); i++)
        {
            char ch = newstr.charAt(i);
            if (i%2==0)
            {
                ch = (char)(ch + 2);
                s = s+ch;
            }
            else
            {
                ch = (char)(ch-2);
                s = s+ch;

            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        encryption obj = new encryption();
        String ans = obj.plusminus(str);
        System.out.println(ans);

    }
}
