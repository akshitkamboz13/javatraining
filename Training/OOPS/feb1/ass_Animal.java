package Java.Training.OOPS.feb1;
import java.util.Scanner;
abstract class Animal
{
    boolean isMammal;
    boolean isCarnivorous;
    Animal(boolean isMammal, boolean isCarnivorous)
    {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }

    public boolean getIsMammal()
    {
        return this.isMammal;
    }

    public boolean getIsCarnivorous()
    {
        return this.isCarnivorous;
    }

    abstract public String getGreeting();        // abstract function

    public void printAnimal(String name)
    {
        System.out.println("A " + name + " says '" + this.getGreeting() + "', is " + (this.getIsCarnivorous() ? "" : "not ")
                + "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal."
        );
    }
}
     class Dog extends Animal
     {
         Dog ()
         {
             super(true, true);
         }
         public String getGreeting()
         {
             return "ruff";
         }
     }
     class Duck extends Animal
     {
         Duck ()
         {
             super(false, false);
         }
         public String getGreeting()
         {
             return "quack";
         }
     }
     class Cow extends Animal
     {
         Cow ()
         {
             super(true, false);
         }
         public String getGreeting()
         {
             return "moo";
         }
     }

public class ass_Animal
{
    public static void main(String[] args)
    {
        Animal dog = new Dog();    // Means koi na koi to relation hai (Inheritance)
        dog.printAnimal("dog");

        Animal cow = new Cow();
        cow.printAnimal("cow");

        Animal duck = new Duck();
        duck.printAnimal("duck");
    }
}

/*
A dog says 'ruff', is carnivorous, and is a mammal.
A cow says 'moo', isnot carnivorous, and is a mammal.
A duck says 'quack', isnot carnivorous, and Is not a mammal.

 */