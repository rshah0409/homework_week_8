/* Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13,  17.... are the prime numbers.)
 */

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CheckPrimeNumber12 {

    public static boolean primeNumber(int number){

//for and if loop.
        for(int i=2; i <=number/2; i++){

             if(number % i==0 || number>=2){
                 System.out.println(  " This is not a prime number  " );  //sout to say number is not prime
                 return false;
             }else{
                 System.out.println( " This is a prime number   ");    //sout to say number is prime
                 return true;

             }


        }return true;

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner( System.in );           //scanner called from util package.
        System.out.println("Enter a number here  ");
        int number = scan.nextInt();                    //next int given for variable number to call in console.
        primeNumber( number );


            }




}
