package Java.Training.OOPS.feb1;

import java.util.*;
abstract class Number
{
    abstract int countNum(int a, int b[]);
}
class CountNum extends Number
{
    int countNum(int a, int b[])
    {
        int count = 0;
        for (int i = 0; i<a; i++)
        {
            int sum = 0;
            for (int j = 0; j<a; j++)
            {
                sum = sum +b[j];

            }
            sum= sum - b[i];
            if(sum%b[i]==0)
            {
                count++;
            }
        }
        return (count);
    }



}
public class ass_array1
{
    public static void main(String[] args)
    {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        CountNum obj = new CountNum();
        System.out.println(obj.countNum(n, a));
    }

}