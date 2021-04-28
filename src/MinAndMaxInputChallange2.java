import java.util.Scanner;
/*. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
*/


public class MinAndMaxInputChallange2 {

    public static void getMinMaxNumbers() {//create method
        Scanner scan = new Scanner(System.in);//create object for scanner
        int i = 0;//all are variables
        int userInput;
        int maxNumber = 0;
        int minNumber = 0;

        while (true) {//condition
            System.out.println("Enter Number:");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (i == 0) {
                    minNumber = userInput;
                    maxNumber = userInput;
                } else {
                    if (userInput < minNumber) {
                        minNumber = userInput;
                    }
                    if (userInput > maxNumber) {
                        maxNumber = userInput;
                    }
                }
                i++;
            } else {
                System.out.println("Invalid Number.");//message for invalid number
                scan.next();
                break;                               //we use break to stop when user enter the invalid number
            }
        }
        System.out.println("Minimum Number is:" + minNumber);//print the minimum number
        System.out.println("Maximum Number is:" + maxNumber);//print the maxnumber
    }

    public static void main(String[] args) {
        getMinMaxNumbers();            //calling static ,ethod into main method.

    }

















}