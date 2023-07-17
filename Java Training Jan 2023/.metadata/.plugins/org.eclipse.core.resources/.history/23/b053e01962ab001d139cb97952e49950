package Java.Training.OOPS.feb2;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class nonvowel_print
{
    String nonvowelprint (String str)
        {
            int count = 0;
            String s = "";
            for (int i = 0; i<str.length(); i++)
            {
                if (str.charAt(i) !='a' && str.charAt(i) !='A'&& str.charAt(i) !='e'&& str.charAt(i) !='E'&& str.charAt(i) !='i'&& str.charAt(i) !='I'&& str.charAt(i) !='o'&& str.charAt(i) !='O'&& str.charAt(i) !='u'&& str.charAt(i) !='U')
                {
                    s = s+ str.charAt(i);
                }
            }
            return s;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String strr = sc.next();
            nonvowel_print obj = new nonvowel_print();
            String ans = obj.nonvowelprint(strr);
            System.out.println(ans);
        }
}
