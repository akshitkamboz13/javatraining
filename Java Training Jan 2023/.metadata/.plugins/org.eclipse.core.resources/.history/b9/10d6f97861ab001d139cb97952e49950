package Java.Training.OOPS.a_jan;

public class Training18_ques_on_functions
    {
        //Q: 1/1!+2/2!+3/3!+4/4!+5/5!
    /*
    int fact(int x)
    {
        int fac = 1;
        for (int i =1; i<=x; i++)
        {
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Training18_ques_on_functions obj = new Training18_ques_on_functions();
        float sum = 0;
        for (int i =1; i<=num; i++)
        {
            int ans = obj.fact(i);
            System.out.println("Factorial of " + i+ " is " + ans);
            sum = sum+((float) i/ans);
        }
        System.out.println("\nSum is: " + sum);
    }

     */

        // Power:
    /*
    int  power(int x, int y)
    {
        int pow =1;
        for(int i = 0; i<y; i++)
        {
            pow = pow*x;
        }

        return pow;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int baseNum = sc.nextInt();
        System.out.println("Enter the power");
        int powerNum = sc.nextInt();
        Training18_ques_on_functions obj = new Training18_ques_on_functions();
        int ans = obj.power(baseNum, powerNum);
        System.out.println(ans);
    }

     */

        // x¹+x²+x³+x^4+x^5
    /*
    int  power(int x, int y)
    {
        int pow =1;
        for(int i = 0; i<y; i++)
        {
            pow = pow*x;
        }

        return pow;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int baseNum = sc.nextInt();
        System.out.println("Enter the power");
        int powerNum = sc.nextInt();
        Training18_ques_on_functions obj = new Training18_ques_on_functions();
        int sum = 0;
        for(int i =1; i<=powerNum; i++)
        {
            int ans = obj.power(baseNum, i);
            sum = sum +ans;
        }
        System.out.println(sum);
    }

     */

        // Strong number using functions:
    /*
    int fact(int y)
    {
        int fac = 1;
        for (int j =1; j<=y; j++)
        {
            fac = fac*j;
        }
        return fac;
    }
    int digit (int x)
    {
        int sum = 0;
        for (int i=x; i>0; )
        {
            int lastDigit = i%10;
            i = i/10;
            int f = fact(lastDigit);
            sum = sum + f;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Training18_ques_on_functions obj = new Training18_ques_on_functions();
        int ans = obj.digit(num);
        if (ans == num)
        {
            System.out.println("Strong");
        }
        else {
            System.out.println("Kamzoor");
        }
    }

     */

        // Arm Strong number:
    /*
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Training18_ques_on_functions obj = new Training18_ques_on_functions();
        int ans = obj.ArmsStrong(num);
        if (ans == num)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Armkamzoor");
        }

    }

    int ArmsStrong (int a)
    {
        int c = countofdigits(a);
        int sum = 0;
        for (int i=a; i>0; )
        {
            int lastdigit = i%10;
            i = i/10;
            sum = sum + power(lastdigit,c);
        }
        return sum;
    }

    int countofdigits (int x)
    {
        int count = 0;
        for(int i = x; i>0; )
        {
            i=i/10;
            count++;
        }
        return count;
    }

    int power (int y , int z)
    {
        int pow = 1;
        for (int i = 0; i < z; i++)
        {
            pow = pow*y;
        }
        return pow;
    }

     */

        // Prime:
    /*
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Training20_funcQ obj = new Training20_funcQ();
        boolean ans = obj.prime(num);
        if(ans==true)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }

    boolean prime (int x)
    {
        int count = 0;
        for(int i = 1; i<=x; i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return true;
        }
        return false;
    }

     */


    }



