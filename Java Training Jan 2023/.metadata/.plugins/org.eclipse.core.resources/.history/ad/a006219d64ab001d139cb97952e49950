package Java.Training.OOPS.feb8;
// passing object as an argument
public class passing_object
{
    int a, b;
    passing_object ()
    {
        a = 5; b = 10;
    }
    void show ()
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    void fun (passing_object jj)
    {
        int t = jj.a;
        jj.a = jj.b;
        jj.b = t;
    }

    public static void main(String[] args) {
        passing_object obj = new passing_object();
        obj.show();
        obj.fun(obj);
        obj.show();
    }
}
