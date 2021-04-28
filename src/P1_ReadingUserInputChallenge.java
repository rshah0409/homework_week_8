import java.util.Scanner;

public class P1_ReadingUserInputChallenge {
/*1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.
*/

//main method
public static void addNumbers() {
    Scanner obj = new Scanner(System.in);   //scanner created from util class
    int a = 1;
    int total = 0;
//while loop
    while (a <= 10) {
        System.out.println("Enter number #" + a + ":");
        if (obj.hasNextInt()) {                                 //adding method with hasnext method called
            total = total + obj.nextInt();
            a++;
         } else {
            System.out.println("Invalid number");               //if alse statement
            obj.next();                                         //to clear the console and move to the next loop/input
         }

         }
               System.out.println("Total=" + total);
         }

    public static void main(String[] args) {


    addNumbers();  //addnumbers method called in main method.
    }




    }

