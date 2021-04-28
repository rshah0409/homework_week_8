import java.util.Scanner;
public class RightAngleTriangleWithAt8 {

   // Display right angle triangle of @ using nested for loops
   /* @
    @@
    @@@
    @@@@
    @@@@@

     */


    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print("@"); //print statement

            System.out.println("");     //print next line.
        }
    }

}











