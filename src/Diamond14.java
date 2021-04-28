/*Write a program in Java to display the pattern like a diamond.   While loop
 *
 ***
 *****
 *******
 *********
***********
*************
***********
 *********
 *******
 *****
 ***
 *

*/
import java.util.Scanner;
public class Diamond14 {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N : ");            //number of rows into console.
        int n=scan.nextInt();
        System.out.print("Enter Symbol : ");

        char c = scan.next().charAt(0);    //taking next character with help of char at
        int i=1;
        int j;
        //while statement
        while(i<=n)
        {
            j=1;
            while(j++<=n-i)
            {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i=n-1;
        while(i>0)
        { j=1;
            while(j++<=n-i)
            { System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1)
            {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
    }













}
