package Java.Training.OOPS.feb9;

import java.util.Scanner;

public class reverse
{
    int sum = 0;

    int rev(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else
        {
            int r = num % 10;
            sum = sum *10 + r;
            rev(num/10);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse obj = new reverse();
        int ans = obj.rev(num);
        System.out.print(ans);


    }
}
