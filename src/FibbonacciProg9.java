public class FibbonacciProg9 {
    //Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

    public static void main(String[] args) {
        int a,b,c,i,count;
           a=0;
           b=1;
           count=9;
        System.out.print(" "+b);   //printing 0 and 1
        for (i =2;i<count;i++){

             c=a+b;
            System.out.print(" "+c);  //c is the first teo numbers added
            a=b;
            b=c;

        }




    }








}
