package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM
          are Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String str1 = "MADAM";
        String str2 = "MANIRUZZAman";
        String str3 = "Radar";
        String str4 = "CIVIC";
        String str5 = "Never";
        checkPalindrome(str1);
        checkPalindrome(str2);
        checkPalindrome(str3);
        checkPalindrome(str4);
        checkPalindrome(str5);

    }
    public static void checkPalindrome(String str) {

        String actual = str.toUpperCase();
        String reverse = "";

        for(int j = actual.length()-1;j>=0;j--) {
            reverse = reverse + actual.charAt(j);

        }
        if(actual.equals(reverse)) {
            System.out.println("Yes, it is a Palindrome word");
        } else{
            System.out.println("No, it is not a Palindrome word");
        }

    }
}
