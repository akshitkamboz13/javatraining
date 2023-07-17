package Java.Training;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class TrainingPractice

            // max min value of an array
            // chocolate wrapper
            // patters: first four done
            // Array 2 + 3 + 4 all questions

//public class vowel_count
{

    String vowelcount (String str)
    {
        String t = "";
        for (int i = 0; i<str.length(); i++)
        {
            if (str.charAt(i) =='a'||str.charAt(i) =='A'||str.charAt(i) =='e'||str.charAt(i) =='E'||str.charAt(i) =='i'||str.charAt(i) =='I'||str.charAt(i) =='o'||str.charAt(i) =='O'||str.charAt(i) =='u'||str.charAt(i) =='U')
            {
                t = t + str.charAt(i);
            }
        }
        return t;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TrainingPractice obj = new TrainingPractice();
        String ans = obj.vowelcount(s);
        System.out.println(ans);
    }
}
