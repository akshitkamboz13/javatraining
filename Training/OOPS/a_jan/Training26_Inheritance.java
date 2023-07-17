package Java.Training.OOPS.a_jan;

class AA
{
    private int a;
    public int b;
    void fun ()
    {
        a=10;
        b=20;
    }
   int geta()
    {
        return a;
    }
}
class BB extends AA
{
    private int c;
    void multiply()
    {
        c = b * geta();
    }
    void show()
    {
        System.out.println("a = " + geta());
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
public class Training26_Inheritance
{
    public static void main(String[] args)
    {
        BB obj = new BB();
        obj.fun();
        obj.multiply();
        obj.show();
        // b ko access krne k liye:
        obj.b = 40;
        obj.multiply();;
        obj.show();
    }
}
