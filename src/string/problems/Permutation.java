package string.problems;
/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
         permutation(" ", "1234");
         }
         public static void permutation(String prefix, String string){
         int n = string.length();

         if(n==0){
            System.out.println(prefix);
         }else{
            for(int i=0; i < n; i++){
                permutation(prefix + string.charAt(i), string.substring(0, i) + string.substring(i+1,n));
            }
        }
    }
}
