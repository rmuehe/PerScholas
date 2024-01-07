package pa_303_2_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinDeletions {

    public static int sumUp(int length) {
        int factorial = 0;
        for (int i = 0; i <= length; i++) {
            factorial += i;
        }
        return factorial;
    }

    public static String[] getAllSubstrings(String str) {
        String[] substrings = new String[sumUp(str.length())];
        int length = str.length();

        for (int i = 0, k = 0; i <= length; i++) {
            for (int j = 0; length - j > i; j++, k++ ) {
                substrings[k] = str.substring(i, length - j);
            }
        }
     return substrings;
    }

    public static int getMinDeletions(String s) {
        Set<Character> chars = new HashSet<>();
        int math = 0;
        int length = s.length();
        for(int i = 0; i < length; i++) {
            if(chars.contains(s.charAt(i))) math++;
            else chars.add(s.charAt(i));
        }
        return math;
    }

//    public static void main(String[] args) {
//        char[] x = new char[10];
//        System.out.println( x instanceof Double);
//    }

}
