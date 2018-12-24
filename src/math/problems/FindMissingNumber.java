package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 9, 3, 7, 8, 6}. One number will be missing in array (5 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 9, 3, 7, 8, 6};
        missingNumber(array, 10);
        }
         public static int missingNumber(int[] array, int n) {
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        System.out.println("The missing number is : "+(total - sum));
        return total - sum;
    }
}
