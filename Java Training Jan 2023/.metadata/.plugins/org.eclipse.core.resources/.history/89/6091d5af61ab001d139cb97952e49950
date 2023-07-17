package Java.Training.OOPS.feb1;
import java.util.*;

class Account
{
    int number, balance;
    public Account(int number, int bal)
    {
        this.number = number;
        this.balance = bal;
    }
    public void withdraw(int amt)
    {
        this.balance -= amt;
    }
    public void deposit(int amt)
    {
        this.balance += amt;
    }
    public int getBalance()
    {

        return this.balance;
    }
}


class AccountTrasactions extends Account
{
    int max , min;
    AccountTrasactions(int x, int y)
    {
        super(x,y);
        max = min = y;
    }

    public int getBalance()
    {
        if (max< balance)
        {
            max = balance;
        }
        if (min> balance)
        {
            min = balance;
        }
        return this.balance;
    }
    int getDifference()
    {
        return max-min;
    }
}


public class ass_bank
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        AccountTrasactions ob = new AccountTrasactions(sc.nextInt(), sc.nextInt());
        System.out.println(ob.getBalance());
        ob.deposit(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.deposit(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.withdraw(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.deposit(sc.nextInt());
        System.out.println(ob.getBalance());
        ob.withdraw(sc.nextInt());
        System.out.println(ob.getBalance());
        System.out.print(ob.getDifference());
        sc.close();
    }

}
/*
10201
1000
600
500
1400
800
500

 */