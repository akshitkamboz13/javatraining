package Java.Training.OOPS.feb10;

import com.sun.source.doctree.BlockTagTree;

public class t4_ip
{
    boolean fun (String str2)
    {
        String arr[] = str2.split("\\.");
        System.out.println(arr.length);
        if (arr.length==4)
        {
            for (int i = 0; i < arr.length; i++)
            {
                int x = Integer.parseInt(arr[i]);
                if (x >= 0 && x <= 255)
                {

                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String str = "45.89.45.2355";
        t4_ip obj = new t4_ip();
        boolean ans = obj.fun(str);
        System.out.println(ans);
    }
}
/*
23.56.87.23.45
0-255.0-255.0-255.0-255  => ek segment isi k beeech hona chahiye
aur ip m 3 hi dot hone chahiye
 */