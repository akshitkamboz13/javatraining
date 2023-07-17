package Java.Training.OOPS.feb5;

public class chandi_garh_pur
{
    public static void main(String[] args)
    {
        String s = "";
        String s0= "Chandigarh university";
        String s1 = "garh";
        String s2 = "pur";
        int loc = s0.indexOf(s1);
        // s = s + s0.substring(0,loc) + s2 + s0.substring(loc+s1.length(),s0.length());
        System.out.println(s);
        for (int  i = 0; i< s0.length(); i++)
        {
            if (i==loc)
            {
                s = s + s2;
                i = i + s1.length();
            }
            s = s + s0.charAt(i);
        }
        System.out.println(s);

    }

}
