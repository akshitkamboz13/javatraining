package Java.Training.OOPS.feb1;
class CC
{
    CC(int x, int y)
    {
        System.out.println(x +" "+y);
    }
}

public class T2parameterized_constructor_chaining extends CC
{
    T2parameterized_constructor_chaining()
    {
        // System.out.println("check"); error dikhayega kyunki super pehli line of code honi vhhiye is function m
        super(10, 30);
        System.out.println("check");
    }

    public static void main(String[] args)
    {
        T2parameterized_constructor_chaining obj = new T2parameterized_constructor_chaining();
    }
}
