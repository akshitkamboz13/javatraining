
/*

final variable = constant reh jata h woh variable.

final function = final function can not be overridden

package Java.Training.OOPS.feb1;

class abc
{
    final void fun ()
    // void fun () aghr sirf yeh likhte to override kr jata child class ka fun
    {
        System.out.println("hello");
    }
}

public class final_keyword
{
    void fun()
    {
        System.out.println("hi");
    }

    public static void main(String[] args)
    {


    }

}

final class = final class cannot be inherited
*/
package Java.Training.OOPS.feb1;

final class abc
{
    void fun ()
    {
        System.out.println("hello");
    }
}

public class T3final_keyword // extends abc  -> nahi use kr skhte h kyunki oopar wali parent class final ki hui h
{
    void fun()
    {
        System.out.println("hi");
    }

    public static void main(String[] args)
    {


    }

}

