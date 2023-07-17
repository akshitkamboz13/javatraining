package Java.Training.OOPS.feb10;

import java.util.Scanner;

public class t7_password_ques
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        try
        {
            if (password.length() < 6)
            {
                throw new Exception("Too Short");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        int count = 0;

        try
        {
            for (int i = 0; i < password.length(); i++)
            {
                if (password.charAt(i)>=48 && password.charAt(i)<=57)
                {
                    count++;
                }
            }
            if (count==0)
            {
                throw new Exception("No digit");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        if (count!=0 && password.length()>=6)
        {
            System.out.println("Correct");
        }
    }
}
