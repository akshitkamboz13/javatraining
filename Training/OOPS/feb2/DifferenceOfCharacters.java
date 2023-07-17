package Java.Training.OOPS.feb2;

import java.util.Scanner;

//hello
//h e l l o  => beech m difference aayega inka
public class DifferenceOfCharacters
{
    String difference (String str2)
    {
        String s = "";
        for(int i = 0; i < str2.length()-1; i++)
        {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            s = s+c1+Math.abs((int)(c1-c2));
        }
        s = s+ str2.charAt(str2.length()-1);
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        DifferenceOfCharacters obj = new DifferenceOfCharacters();
        String ans = obj.difference(str);
        System.out.println(ans);
    }
}
