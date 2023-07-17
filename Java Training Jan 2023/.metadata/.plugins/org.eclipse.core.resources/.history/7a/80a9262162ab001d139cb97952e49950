package Java.Training.OOPS.feb2;

public class SmallCapitalReverse
{
    String fun(String str2)
    {
        String s = "";
        for (int i =0; i<str2.length(); i++)
        {
            char ch = str2.charAt(i);
            if (ch >= 65 && ch <= 90) //  if (ch <= 'Z' && ch >= 'A') yeh  b use kr skhte hai
            {
                ch = (char)(ch + 32);
            }
            else if (ch >= 97 && ch <= 122)
            {
                ch = (char)(ch - 32);
            }

            s = s+ ch;
        }
        return s;
    }
    public static void main(String[] args)
    {
        String str = "HellO"; //hELLo
        SmallCapitalReverse obj = new SmallCapitalReverse();
        String ans = obj.fun(str);
        System.out.println(ans);
    }
}
