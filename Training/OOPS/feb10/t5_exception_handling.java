package Java.Training.OOPS.feb10;

public class t5_exception_handling
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        try
        {
            int arr [] = {11, 22, 33};
            System.out.println(arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("hello");

    }
}
