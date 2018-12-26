package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        // Using iteration finding out Factorial of 5
        int n = 5;
        int result = 1;

       for (int i = 1; i <= 5; i++) {
            result = result * i;
        }
        System.out.println("The Factorial of 5 using Iterator is : " + result);
        System.out.println("The Factorial of 5 using recursion is : " + factorial(5));
    }

    // Using Recursion finding out Factorial of 5
    public static int factorial(int n) {
       if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
       }

   }

}