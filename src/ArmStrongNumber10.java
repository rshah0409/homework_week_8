/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153  */

import java.util.Scanner;

public class ArmStrongNumber10 {
//main method
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter an input");
        int c = 0,a,temp;

       int n = scan.nextInt();  //to get the next int number in console for variable n

        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);   //formula to calculate an armstrong number.
        }
        if(temp==c) {
            System.out.println(" It is an Armstrong number");    //sout to say it is true
        }   else
            System.out.println("It is not an Armstrong number"); //sout to say false
    }
}




















