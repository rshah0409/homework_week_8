/*Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not  within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
        NOTE: The method hasSharedDigit should be defined as public static

*/
public class SharedDigits13 {
    public static boolean hasSharedDigit(int numberone,int numbertwo) {
        boolean result = true;
        int num1d1, num1d2, num2d1, num2d2;
        num1d1 = numberone / 10;                //first digit of first number
        num1d2 = numberone % 10;               //second digit of first number
        num2d1 = numbertwo / 10;              //first digit of second number
        num2d2 = numbertwo % 10;               //second digit of second number
        //comparing both digits with if else statement.
        if ((numberone < 10 || numberone > 99) || (numbertwo < 10 || numbertwo > 99)) {

            System.out.println( result = false );
        } else if (num1d1 == num2d1 || num1d1 == num2d2 || num1d2 == num2d1 || num1d2 == num2d2) {

                System.out.println( result = true );
            } else {
                System.out.println( result = false );
            }
            


        return result;
    }
        
    
    public static void main(String[] args) {
         hasSharedDigit( 9,99);  //method calling into main method.
    }
}
