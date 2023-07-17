package Java.Training.Basics;

public class Training02ControlStatement {
    public static void main(String[] args) {
        /*

        Control statements : It controls the flow of our program
                           => if
                              if else
                              else if
                              switch
                              for
                              while
                              do while
                              break
                              continue
                              return
                              exit



                          eg  greater between two
                              int a =5, b = 9;
                              if (a>b)
                              {
                                   System.out.println("a");
                              }
                              else
                              {
                                   System.out.println("b");
                              }

        eg  greater among three


        int a = 7, b = 9, c = 16;
        if (a>b)
        {
            if(a>c)
            {
                System.out.println("a");
            }
            else
            {
                System.out.println("c");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b");
            }
            else
            {
                System.out.println("c");
            }

        }



        //Same question using only if with the help of logical operators

        int a = 7, b = 9, c = 16;

        if (a>b && a>c)
        {
            System.out.println("a");    // yahan aghr a sab se bada hota yeh fir b baki if check krta to us se complexity badegi (execution run time) aur time b bade ga, to best h pehle if k baad else if use krna
        }
        if (b>c && b>c)
        {
            System.out.println("b");
        }
        if (c>a && c>b)
        {
            System.out.println("c");
        }



    eg

    Precedence of Operators:
->  Arithmetic operator:
    i) * /
   ii) + -
  iii) %




        float math = 90, phy = 79, comp = 88;
        float per = ((math + phy + comp) / 300 ) * 100;    // per = (math + phy + comp) * 100 / 300
        System.out.println(per);
    //  per >=60 -- First Div
    //  per >=50 -- Second Div
    //  per >=40 -- Third Div
    //  per <40 -- Fail

        if (per >=60)
        {
            System.out.println("First Div");
        }
        if (per < 60 && per >=50)
        {
            System.out.println("Second Div");
        }
        if (per < 50 && per >=40)
        {
            System.out.println("Third Div");
        }
        if (per <40)
        {
            System.out.println("Fail");
        }




        // for female exp > 5 inc = 20 %
        //            exp >3 & <5 inc = 15 %

        // for male exp > 5 inc = 15 %
        //            exp >3 & <5 inc = 10%

        int sal = 100;
        char gen = 'f';
        int exp = 7;
        int incr = 0;
        int c=0; //flag variable
        if (gen == 'f')
        {
            if (exp > 5)
            {
                incr = sal * 20 / 100;
            }
            if (exp >3 && exp <=5)
            {
                incr = sal * 15 / 100;
            }
        }

        else if (gen == 'm')
        {
            if (exp > 5)
            {
                incr = sal * 15 / 100;
            }
            if (exp >3 && exp <=5)
            {
                incr = sal * 10 / 100;
            }
        }
        else
            {
                System.out.println("Error");
                c++;
            }
        if(c==0)
        {
            System.out.println("Increment is " + incr);
            int ts = sal + incr;
            System.out.println("Total Salary is " + ts);
        }


        // Program to calculate fine for taking book from library
        // Library
        // Days             Per Day
        // 0 - 5            Rs 1
        // 6 - 10           Rs 2
        // 11 - 15          Rs 5
        // Above            Rs 10


        int days = 13, fine = 0;
        if (days > 0 && days <=5)
        {
            fine = days *1;
            System.out.println(fine);
        }

        if (days > 5 && days <=10)
        {
            //fine = (days *2) - (5*1);
            fine = 5 + (days - 5) *2;
            System.out.println(fine);
        }

        if (days > 10 && days <=15)
        {
            //fine = (days *5) - (10*2) - (5*1); galti h
            fine = 15 + (days - 10) * 5;
            System.out.println(fine);
        }

        if (days > 15)
        {
            //fine = (days *10) - (15*5) - (10*2) - (5*1);
            fine =  40 + (days - 15) * 10;
            System.out.println(fine);
        }




        //Leap year
        //Condition : Year % 4 = 0 && if year ends with 00 then year % 100 = 0 and year % 400 = 0

        int yr = 1988;
        if (yr % 4 == 0)
        {
            if (yr % 100 == 0)
            {
                if (yr % 400 == 0)
                {
                    System.out.println("Is a leap year");
                }
                else
                {
                    System.out.println("Not a leap year");
                }
            }
            else
            {
                System.out.println("Is a leap year");
            }
        }
        else
        {
            System.out.println("Is not a leap yaer");
        }


         */

        int y = 2100;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)         //(y % 4 == 0 || y % 100 != 0 && y % 400 == 0)  yeh galat hai

        {
            System.out.println("Leap");
        }
        else
        {
            System.out.println("Not Leap");
        }

    }
}
