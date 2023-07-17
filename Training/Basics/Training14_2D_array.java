package Java.Training.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Training14_2D_array
{
    public static void main(String[] args)
    {
        // Initialise 2D arrays:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements are: ");
        for (i=0; i<r; i++)
        {
            for (j=0; j<c; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

         */

        // Adding two 2d arrays:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns of first array: ");
        int r = sc.nextInt(), c = sc.nextInt();

        System.out.print("\nEnter the rows and columns of second array: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        int i, j;

        if(r==r2 && c==c2)
        {
            int arr[][] = new int [r][c];
            int arr2[][] = new int [r2][c2];
            int arr3[][] = new int [r][c];

            System.out.print("\nEnter the elements of first array: ");
            for (i=0; i<r; i++) //ROWS
            {
                for (j = 0; j < c; j++) //column
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.print("\nEnter the elements of second array: ");
            for (i=0; i<r2; i++) //ROWS
            {
                for (j = 0; j < c2; j++) //column
                {
                    arr2[i][j] = sc.nextInt();
                }
            }

            System.out.println("Sum of two arrays is: ");
            for (i=0; i<r; i++)
            {
                for (j=0; j<c; j++)
                {
                    arr3[i][j] = arr[i][j] + arr2[i][j];
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }

        }
        else
        {
            System.out.println("Addition is not possible for two arrays of different rows and columns: ");
        }

         */

        // Sum of diagonal elements:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");

        if (r==c)
        {
            for (i = 0; i < r; i++) //ROWS
            {
                for (j = 0; j < c; j++) //column
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            for (i = 0; i < r; i++) //ROWS
            {
                for (j = 0; j < c; j++) //column
                {
                    if (i == j)
                    {
                        sum = sum + arr[i][j];
                    }
                }
            }
            System.out.println("The sum of the diagonal elements is : " +sum);
        }
        else
        {
            System.out.println("Not possible");
        }

         */

        // Sum of diagonal elements (2):
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();

        if (r==c)
        {
            int arr[][] = new int [r][c];
            System.out.println("Enter the elements: ");
            int i, j;
            for (i = 0; i < r; i++) //ROWS
            {
                for (j = 0; j < c; j++) //column
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            for (i = 0; i < r; i++) //ROWS
            {
                for (j = 0; j < c; j++) //column
                {
                    if (i+j == r-1)
                    {
                        sum = sum + arr[i][j];
                    }
                }
            }
            System.out.println("The sum of the diagonal elements is : " +sum);
        }
        else
        {
            System.out.println("Not possible");
        }
         */

        // Transpose [Change rows to columns]
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();

            int arr[][] = new int [r][c];
            int i, j;
            System.out.println("Enter the elements: ");
            for (i=0; i<r; i++) //ROWS
            {
                for (j = 0; j < c; j++) //column
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            int brr[][] = new int [c][r]; // pehla c hai dosra r kyunki transpose hoga.
            System.out.println("The elements after transpose are: ");
            for (i=0; i<c; i++)         // yahan hamne r k badle c aur c kl badle r rkha taki aghr non square matrix hoga to eg, 2 by 3 ka array h owh 3 by 2 banega.
            {
                for (j=0; j<r; j++)
                {
                    //System.out.print(arr[j][i]+ " ");
                    brr[i][j]= arr [j][i];

                    System.out.print(brr[i][j] + " ");
                }

                System.out.println();
            }

         */

        // Sum of rows and columns:
        /*
        row right jayega, col nneeche jayega
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }


        for (i=0; i<r; i++)
        {
            int sum = 0;
            for (j=0; j<c; j++)
            {
                sum = sum + arr [i][j];
            }
            System.out.println("The sum of row " + (i+1) + " is " + sum);

        }
        for (i=0; i<c; i++)
        {
            int sum = 0;
            for (j=0; j<r; j++)
            {
                sum = sum + arr [j][i];
            }
            System.out.println("The sum of column " + (i+1) + " is " + sum);

        }

         */

        // Reverse column:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements are: ");
        for (i=r-1; i>=0; i--)
        {
            for (j=0; j<c; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

         */

        // Reverse rows:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements are: ");
        for (i=0; i<r; i++)
        {
            for (j=c-1; j>=0; j--)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

         */

        // 180degree rotation:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements are: ");
        for (i=r-1; i>=0; i--)
        {
            for (j=c-1; j>=0; j--)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

         */

        // 90Degree rotation: (first transpose, matlab change rows to columns fir reverse rows)
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int brr[][] = new int [c][r];
        for (i=0; i<c; i++)
        {
            for (j=0; j<r; j++)
            {
                brr[i][j]= arr [j][i];
            }
        }

        System.out.println("The elements are: ");
        for (i=0; i<r; i++)
        {
            for (j=c-1; j>=0; j--)
            {
                System.out.print(brr[i][j]+ " ");
            }
            System.out.println();
        }
         */
        // 90degree: isme ham transpose aur reverse ek hi loop m krte hai:
        /*
        System.out.println("The elements are: ");
        for (i=0; i<c; i++)
        {
            for (j=r-1; j>=0; j--)

            {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
         */

        // Hollow printing:
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int arr[][] = new int [r][c];
        int i, j;
        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i=0; i<r; i++) //ROWS
        {
            for (j = 0; j < c; j++) //column
            {
                if ( i==0 || i==r-1 ||j==0 || j==c-1)
                {
                    System.out.print(arr[i][j]+ " ");
                }
                else
                {
                    System.out.print(" " + " ");    //aessai dale spaces taki samaj aaye do saces dale hai.
                }
            }
            System.out.println();
        }

         */

        // Minimum from rows:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt(),i,j;
        int arr[][] = new int [r][c];

        System.out.println("Enter the elements: ");
        for (i=0; i<r; i++)
        {
            for(j=0; j<c ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i=0; i<r+1; i++)
        {
            for(j=0; j<c+1; j++)
            {
                    System.out.println(arr[i][j]);
            }
        }



        // Minimum from columns:

        // Spiral
    }
}
















