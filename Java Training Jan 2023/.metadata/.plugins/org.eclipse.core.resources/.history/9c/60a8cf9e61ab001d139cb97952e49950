package Java.Training.OOPS.a_jan;

import java.util.Scanner;

public class Training24_studentDataoperations
{

        void input(Training24_studentData2 arr[])
        {
            Scanner sc = new Scanner(System.in);
            // Training24_studentData2 arr[] = new Training24_studentData2[3];
            for (int i = 0; i < 3; i++)
            {
                System.out.println("Enter the roll no. and name: ");
                int r = sc.nextInt();
                String naame = sc.nextLine();
                naame = sc.nextLine();
                Training24_studentData2 obj = new Training24_studentData2();
            /*
            Training24_studentData2 obj = new Training24_studentData2(r, naame);
            obj.id = r;
            obj.name = naame;
             */
                obj.setId(r);
                obj.setName(naame);
                arr[i] = obj;
            }
        }


        void display(Training24_studentData2 arr[])
        {
            System.out.println("Student data: ");
            for (int i = 0; i < arr.length; i++)
            {
                Training24_studentData2 obj = arr[i];
                System.out.println(obj.getId() + "\t" + obj.getName());
            }
        }

}
