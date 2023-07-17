package Java.Training.OOPS.feb9;
// recursion: when function calls itself.
public class recursion
{
    void fun (int num)
    {
        if (num == 0)
        {
            return;
        }
        else
        {
            System.out.print(num + " ");
            fun(num-1);

            // fun(num-1);
            System.out.print(num + " "); // baad m print krane se hame 1 2 3 aayega answer kyunki isme back end pr stack use hota h (last in first out)

        }
    }
    public static void main(String[] args)
    {
        int num = 3;
        recursion obj = new recursion();
        obj.fun(num);
    }
}
