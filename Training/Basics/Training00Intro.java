package Java.Training.Basics;

public class Training00Intro {
    public static void main(String[] args) {

        /*

      ->Program: Set of instructions.

      ->Software: Set of programs.

      ->OOPS: Object oriented programming language, it refers to the style of programming that is defined using objects.

              Features-> 1) Class: It is a collection of data members and member functions.
                             /
     (helps in security)<---/  eg: class bank               //do not start a name with a number. (object, class, kisi ka b naam)
                                   {
                                   int cid;
                                   string cname;
                                   deposit()    //function
                                     {
                                        //code
                                     }
                                   withdrawl()  //function
                                     {
                                        //code
                                     }
                                   display()    //function                  //more functions = more readability
                                     {
                                        //code
                                     }
                                   }

                         2) Object: It is a blueprint of a class, we can access the class with an object. (It is a real time/runtime entity)

                                    eg: bank obj:
                                        obj.deposit();
                                        obj.display();

                         3) Encapsulation: Wrapping of data and function together.

                         4) Data Abstraction: Hiding of data. (by using private keywords)

                         5) Inheritance: Parent child relation is known as inheritance.
                                         When child class inherit the property of parent class.     (Private properties inherit nahi hoty)

  (When child inherit the property   Multiple inheritance nahi possible OOPS mai, kyunki agar parent class donu same naam k honge to child class m call krne k wkht confuse hoga)
   of more than one parent class.     >> Oopar wali situation ko kehte hai ambiguity situation.
   i.e, single chile, two or more
   parent class)

                         6) Polymorphism: Same name of functions and many forms.

                                > Function Overloading: (also called method overloading)
                                  - Jab ek hi class mai same name k functions ho aur unka kaam alag ho.
                                  - When within a one class we have same name of more than one functions with different signatures. (passing arguments)

                                   eg: class abc
                                       {
                                            void fun()
                                              {
                                                   hello;
                                              }

                                            void fun()
                                              {
                                                   hii;
                                              }

                                       }

                                       abc obj;
                                       obj.fun();

                                       Output: Compile time error

                                > Function Overriding: When one class inherits other class and have same function name (one class musrt have been inherited from other class) the child class will always override parent class.

                                  eg: class parent
                                      {
                                            fun()
                                            {
                                                hello;
                                            }
                                      }

                                      class child extends parent
                                      {
                                            sum()
                                            {
                                                hii;
                                            }
                                      }

                                      child obj;            ----> inherited class ko call karna chahiye aur agar same naam hoga to bhi child class hi call hoga.
                                      obj.fun();
                                      //child class overrides the parent class

      ->Java features:

            1)Purely object oriented: Without a class we cannot create any program in java.
                                      Everything should be within the class.

            2) Platform independent: Operarting system independent (environment independent)
                                     Har OS par chalke same result aayega, same cheez dikhegi.
                                     Because of interpreter (JVM)
                                     JVM = Java Virtual Machine
                                     JVM is an abstract computing machine that is responsible for executing java programs line by line.
                                     When you write a java program, the source code is compiled into byte code which is understandable by the JVM.

                                     3 phases of java program:

                                                compiler helps in compiling             Interpreter helps in running (JVM)
                                     [abc.java]-----------------------------[bite code]-----------------------------------[     ]
                                                                            [abc.class]
                                     * bite code is the compiled form of a java program, yeh compile hone k baad milta hai.
                                     * JVM acts like an OS and is an interpreter.
                                     * JVM is machine dependent

            3) Hardware independent

            4) Robust: Robust = Strong
                    a) Type safety: Without declaration we cannot use any variable in java. [local variables k liye h yeh]
                       eg: int a;
                       print(a):    //error aaayega

                            int a=9; aessai initialize krna hota hai

                    b) Garbage collection: To free the memory from unused variable

                    c) Exception handling: Abnormal condition which can terminate the program.      // exception handling se error nhi aata.

                       eg: int a = 10;
                           int b = 0;
                           int c = a/b;
                           print(c);            //terminate sthe program here because o arithmetic exception
                           print("hello");

                       other example of exception handling is -> InputMismatchexception


                       keywords: try
                                 catch
                                 finally
                                 throw
                                 throws

            5) Multithreading: When 2 or more threads run simultaneously.
                   -thread- means 'Paath of execution'

         */


    }
}
