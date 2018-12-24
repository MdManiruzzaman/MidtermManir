package string.problems;

import java.util.*;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        String[] word = s.split( " " );
        String str = " ";

        for ( int i = 0; i < word.length; i++ )
        {
            if ( word[i].length() > str.length() )
                str = word[i];
        }
        System.out.println(str.length()+ " " + str );
    }
}
