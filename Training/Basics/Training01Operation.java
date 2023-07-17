package Java.Training.Basics;

public class Training01Operation {
    public static void main(String[] args) {
        /*
                Operators:
                    1, Assignment : int a = 7; => is equal to h assignment operator, jo value assign krta hai.

                    2, Arithmetic : +,-,*,/,%(Modulus) => Modulus is used to find reminder.
                                                          int a = 10;
                                                          int b = 2;
                                                          int c = a % b;

                                                          Output aayega => 0
                    3, Relational : >,<,>=,<=,==,!=

                    4, Logical : AND---> &&
                                 OR--->  ||
                                 NOT---> !!
                    5, Increment / Decrement : ++,--
                                > Pre : Value milne se pehle increment ya decrement hoga.
                                > Post : Value milne k baad increment ya decrement hoga.

                            eg  int a = 2;
                                ++a;    //pre increment
                                print(a);
                                a++;    //post increment    // aghr isi line m print karate toh 3 hi print hota, lekin jessai ji line se nikle ga yeh toh increment hojayega.
                                print(a);

                                Output = 3, 4

                            eg  int a = 2;
                                int b = a++ + a++ + a++;
                                //      2     3     4           => har increment k sath a ki value increase hogi, aur end pr line k baad uski value 5 hogi
                                sout("b = " + b);
                                sout("a = " + a);

                                Output=   b = 9
                                          a = 5

                            eg  int a = 2;
                                int b = ++a + ++a + ++a;
                                //        3     4     5
                                sout("b = " + b);
                                sout("a = " + a);

                                Output=   b = 12
                                          a = 5

                            eg  int a = 2;
                                int b = a++ + a++ + ++a;
                                //      2     3       5
                                sout("b = " + b);
                                sout("a = " + a);

                                Output=   b = 10
                                          a = 5

                            eg  int a = 2;
                                int b = ++a + ++a + a++;
                                //        3     4   4
                                sout("b = " + b);
                                sout("a = " + a);

                                Output=   b = 11
                                          a = 5

                            eg  int a = 2;
                                int b = ++a + --a + a--;
                                //        3     2   2
                                sout("b = " + b);
                                sout("a = " + a);

                                Output=   b = 7
                                          a = 1


                    6, Conditional Operator : (Caller Ternary operator because it works on three operators)
                                               exp1 ? exp2 : exp3
                                               If expression1 is true then control will move to expression2 otherwise expression will go to expression3

                                           eg : int a = 8, b = 5;
                                                int c = a > b ? a : b;          [a > b is 1 expression, a is 2nd and b is third]
                                                sout(c)

                                                Output = 8


                                           eg : int a = 8, b = 5, c = 6;
                                                int d = a > b ? (a > c ? a : c) : (b > c ? b : c);
                                                sout(d)

                                                Output = 8

                    7, Bitwise operator : i) Bitwise AND            &
                                         ii) Bitwise OR             |
                                        iii) Bitwise XOR            ^
                                         iv) Bitwise Right Shift    >>
                                          v) Bitwise Left Shift     <<

                                                    OR (+)      And(*)      XOR
                                             0 0    0           0           0
                                             0 1    1           0           1
                                             1 0    1           0           1
                                             1 1    1           1           0


                                       eg  int a = 5, b = 9;            5 = 0101
                                           int c = a & b;               9 = 1001
                                           print(c);                    & = 0001
                                                                        | = 1101   1101=13 because in 8 4 2 1, 8=1, 4=1, 2=0, 1=1 =>8+4+1=13
                                           Output = 13


                                           Right shift: int a = 5;                   5 = 1 0 1
                                                        int ans = a >> 1;       a >> 1 = 1 0  (right wala binary number hatega) => 1 0 = 2     8 4 2 1 -> 0 1 0 1 yahan abh right ko chalega sara 0 0 1 0 tabhi 1 0 aayega aur 2 h uski value
                                                        print(ans);

                                                        Output = 2

                                            Left Shift: a = 5;                       5 = 0 1 0 1
                                                        a << 1;                 a << 1 = 1 0 1 0 (left wala binary no. left left chalega) => 1 0 1 0 = 10    8 4 2 1 -> 0 1 0 1 yahan abh left waala bit left left chalega sara fir 1 0 1 0 aayega, jiski walue h 10

-> Finding Binary value of: 25 [divide 25 by 2 like we do in LCM]  // We can also use 8 4 2 1 rule

                            2 25
                            2 12 1
                            2  6 0
                            2  3 0
                               1 1
                            => Binary value of 25 is 11001



                Unary operators: (only has one operand)
                    eg  a++
                        ++a
                Binary operators: (has two operators)
                    eg  a + b

         */


    }
}
