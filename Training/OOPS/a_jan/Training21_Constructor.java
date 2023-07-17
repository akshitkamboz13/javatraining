package Java.Training.OOPS.a_jan;

public class Training21_Constructor
{
    // It is a function whose name is same as that of class name.
    // It does not have any return type.
    // If we don't use a constructor, they are already present at the backend, we can't access them.
    // Now if we create a constructor, now control and responsibility for ok report is in our hands.
    // They are called automatically, when ever we create an object.
    // 3 types of constructor: default
    //                         parameterised
    //                         copy constructor


    //Default constructor:
    /*
    int a;
    Training21_Constructor() // this is a default constructor
    {
        a = 10;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Training21_Constructor obj = new Training21_Constructor();
        obj.show(); //yahan ham seeda show ko call kr skhte h kyunki pehla wala hamara constructor function hai aur woh khud automatically call hoga.
    }

     */

    // Parameterised constructor: jisme ham arguments b pass kre constructor mai
    /*
    Training21_Constructor(){} // refer to line 45
    Training21_Constructor(int x)
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        Training21_Constructor obj = new Training21_Constructor(7);
        Training21_Constructor obj2 = new Training21_Constructor(); //  yeh arguments pass nahi kr raha, toh error dikhayega kyunki default constructor present nahi hai. Us liye ham line 36 wala jugaad krte hai.
    }

     */

    // Copy Constructor: ek object ka samaan dosre object m copy krte hai

    public static void main(String[] args)
    {
        Training21_Constructor obj1 = new Training21_Constructor();
        obj1.fun();
        Training21_Constructor obj2 = new Training21_Constructor(obj1);
        // obj2 = obj1; yeh nahi krna h kyunki is se adresses b copy honge aur aghr ek m change aayi to dosre m b aayegi.
        // obj2.a = obj1.a; yeh b kr skhte h lekin aghr bht baar use krna hoga to baar baar .a nahi use kr skhte h to us k liye obj2 jidr banaya line 55 m woh dekho.
        obj2.show();
    }

    Training21_Constructor (){}
    Training21_Constructor (Training21_Constructor obj)
    {
        a = obj.a; // is  se line 58 ka kaam sab k liye hoga.
    }
    int a;

    void fun()
    {
        a=10;
    }
    void show()
    {
        System.out.println(a);
    }
}
