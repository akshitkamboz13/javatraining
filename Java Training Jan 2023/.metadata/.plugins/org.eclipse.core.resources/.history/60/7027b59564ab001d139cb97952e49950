package Java.Training.OOPS.feb5;
// input: hello how are you
// output: oellh woh era uoy
public class FirstLast_ch
{
    String fun (String str)
    {
        String arr[] = str.split(" ");
        String g = "";
        for (int i = 0; i<arr.length; i++)
        {
            String s = arr[i];
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            g = g + last + s.substring(1, s.length()-1 ) + first + " ";
        }
        return g.trim();
    }

    public static void main(String[] args)
    {
        String s = "hello how are you";
        FirstLast_ch obj = new FirstLast_ch();
        String ans = obj.fun(s);
        System.out.println(ans);
    }
}
