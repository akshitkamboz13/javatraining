package Java.Training.OOPS.feb4;

public class multi_world_string
{
    // reverse of each word on its own place
    String fun(String str)
    {
        String t = "";
        int pos = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                for (int j = i-1; j >=pos; j--)
                {
                    t = t + str.charAt(j);
                }
                t = t + " ";
                pos = i+1;
            }
            if (ch ==str.charAt(str.length()-1))
            {
                for (int j = str.length()-1; j >=pos; j--)
                {
                    t = t + str.charAt(j);                }
            }
        }
        return t;
    }
    public static void main(String[] args)
    {
        String s = "hello how are you"; // olleh woh era uoy
        multi_world_string obj = new multi_world_string();
        String ans = obj.fun(s);
        System.out.println(ans);
    }
}
