package Java.Training.OOPS.a_jan;

public class Training19_Instance_variable
{
    int a; //instance variable (bole to class ka variable)

    // static int a; single memory shared between different objects
    // static keyword is a memory management tool.

    // static ham function se pehle, inner class se pehle aur instance variable se pehle use kr skhte hai

    //yeh use kr ne se object jitne b ban jaye to un me value chali jayegi jo fun m ham initialise krenge
    // so if one object updates the static variable it gets updates for all objects.
    void fun()
    {
        a = 10;
     // int a = 10 nahi likh skhte khyunki us se yeh local variable banega, aur is function k bahir use nahi hoga.
    }

    void show()
    {
        System.out.println("a = " + a);
    }

    public static void main(String[] args)
    {
        Training19_Instance_variable obj = new Training19_Instance_variable();
        Training19_Instance_variable obj2 = new Training19_Instance_variable();
        // aghr sirf obj.show likjte to fun ko call nahi krte ham aur a ki value zero aajaty instance variable se(instance variable ki value aghr nahi deke hogy to zero print hoga)
        obj.show(); // yahan zero print hoga
        obj.fun();
        obj.show(); // yahan 10 aayega
        obj2.show(); //  yahan b zero aaye ga kyunki obj2 fun m nahi gaya
    }
}
