package Java.Training.OOPS.feb5;

public class Capitalise
{
    String fun (String str)
    {
        String arr[]=str.split(" ");
        String s = "";
        for (int i = 0; i < arr.length; i++)
        {
            String g = arr [i];
            char first = g.charAt(0);
            if (first >= 97 && first <=122)
            {
                first = (char)(first - 32);
            }
            s = s + first + g.substring(1, g.length());
            /*
            //sub string use krenge
            for (int j=1; j<g.length(); j++)
            {
                s = s + g.charAt(j);
            }
             */

            s = s + " ";
        }
        return s;
    }

    public static void main(String[] args)
    {
        String s = "hello how are you";
        Capitalise obj = new Capitalise();
        String ans = obj.fun(s);
        System.out.println(ans);
    }
}