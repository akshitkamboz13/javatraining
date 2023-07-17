package Java.Training.OOPS.a_jan;

class xyz
    {
        void fun()
        {
            System.out.println("hello");
        }
    }

public class Training27_inheritance2 extends xyz
{
    void fun () //overriding
    {
        super.fun(); //super is a keyword which is used to access the property of a super class
        System.out.println("hii");
    }

    public static void main(String[] args)
    {
        Training27_inheritance2 obj = new Training27_inheritance2();
        obj.fun();
    }
}


