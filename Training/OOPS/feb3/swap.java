package Java.Training.OOPS.feb3;

public class swap
{
    String fun(String t)
    {
        String rs = "";
        rs = rs + t.charAt(t.length()-1);

        for (int i = 1; i <t.length()-1; i++)
        {
            rs = rs + t.charAt(i);
        }
        rs = rs + t.charAt(0);
        return rs;
    }
    public static void main(String[] args)
    {
        String s = "abcd";

        swap obj = new swap();
        String ans = obj.fun(s);
        System.out.println(ans);
    }
}
