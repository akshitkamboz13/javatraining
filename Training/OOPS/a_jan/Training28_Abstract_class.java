package Java.Training.OOPS.a_jan;

abstract class kk // it is a class which contains both defined and undefined functions
                  // abstract class ka object nahi ban skhta hai
{
    void fun () // defined function
    {

    }
    abstract void sun(); // undefined function
}


public class Training28_Abstract_class extends kk     // class which extends the abstract class should define all the undefined functions of abstract class
{
    void sun()
    {
        System.out.println("hi");
    }

    public static void main(String[] args)
    {
        Training28_Abstract_class obj = new Training28_Abstract_class();
        kk g = new Training28_Abstract_class(); // yeh obj b Training28_Abstract_class ka bana kyunki new b usi k sath h
        obj.fun();
    }
}
