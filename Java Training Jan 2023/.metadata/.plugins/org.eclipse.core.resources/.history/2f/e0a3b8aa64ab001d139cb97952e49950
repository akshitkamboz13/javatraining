package Java.Training.OOPS.feb9;

import java.util.Scanner;

public class power
{
    int pow (int b, int p)
    {
        if (p==0)
        {
            return 1;
        }
        else
        {
            return b * pow(b, p-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        power obj = new power();
        int ans = obj.pow(base, power);
        System.out.println(ans);
    }
}
