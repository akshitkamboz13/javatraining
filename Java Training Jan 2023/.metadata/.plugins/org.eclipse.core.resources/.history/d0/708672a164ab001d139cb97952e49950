package Java.Training.OOPS.feb9;

public class binary_number
{
    int n = 0;
    int binary(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else
        {
            int r = num % 2;
            binary(num/2);
            n = n *10 +r;

        }
        return n;
    }
    public static void main(String[] args)
    {
        int num = 25;
        binary_number obj = new binary_number();
        int ans = obj.binary(num);
        System.out.println(ans);
    }
}
