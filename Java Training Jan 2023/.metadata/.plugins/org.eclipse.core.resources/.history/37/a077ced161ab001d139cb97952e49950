package Java.Training.OOPS.feb1;

public class T4function_overloading
{
    void fun ()
    {
        System.out.println("hi");
        fun(1);
    }

    void fun (int x) // same name k functions ek class m tabhi ho skhte h jab unme different parameters honge, warna aghr parameters nahi honge to error dega
    {
        System.out.println("hello");
    }

    public static void main(String[] args)
    {
        T4function_overloading obj = new T4function_overloading();
        obj.fun(); // ye "hi" print krega kyunki iske b parameter nahi h usme b nahi
        //obj.fun(1); // ye "hello" print krega kyunki iske b parameter m int type value h usme b.
                      // aghr yeh line b nahi print karani, matlab ek hi baar main m obj se call krna ho to oopar wale ek function se doosra function call kara skhte hai
    }
}
