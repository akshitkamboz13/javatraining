package Java.Training.OOPS.feb4;

public class multi_world_string2
{
    // pehla world last m dosra second last and so on
    String fun(String str)
    {
        String t = "";
        int pos = str.length()-1;
        for (int i = str.length()-1; i >=0; i--)
        {
            if (str.charAt(i) == ' ')
            {
                for (int j = i+1; j<=pos; j++)
                {
                    t=t+str.charAt(j);
                }
                t = t + " ";
                pos = i-1;
            }
            if (i == 0)
            {
                for (int j = i; j <=pos; j++)
                {
                    t = t + str.charAt(j);
                }
            }
        }
        return t;
    }
    public static void main(String[] args)
    {
        String s = "hello how are you"; // you are how hello
        multi_world_string2 obj = new multi_world_string2();
        String ans = obj.fun(s);
        System.out.println(ans);

    }
}
