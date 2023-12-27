package glab_303_3_1;
// importing Arrays to convert array to string
// used for printing arrays
import java.util.Arrays;
public class StringMethods {

    public static void main(String[] args) {
/********************************************************/
        // 1. length()
        // returns the length of the string, or it returns
        // the count of the total number of characters present
        // in the string.

        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

/********************************************************/
        // 2.  IsEmpty()
        // checks whether the String contains anything or not. If
        // the Java String is empty, it returns true or false.

        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false

/********************************************************/
        // 3. Trim()
        // removes the leading and trailing spaces. It checks
        // the Unicode value of the space character (‘\u0020’)
        // before and after the string. If it exists, then remove
        // the spaces and return the omitted string.

        s1 = "  hello   ";
        System.out.println(s1+"how are you");        // “  hello   how are you”
        System.out.println(s1.trim()+" how are you"); // "hello how are you”

/********************************************************/
        // 4. toLowerCase()
        // converts all the characters of the String to lowercase.

        s1 = "HELLO HOW Are You?";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);   // “hello how are you?”

/********************************************************/
        // 5. Java String toUpper() method:
        // converts all String characters to uppercase.
        s1 = "hello how are you";
        String s1upper = s1.toUpperCase();
        System.out.println(s1upper); // “HELLO HOW ARE YOU.”

/********************************************************/
        // 6. concat()
        //You can also use the + operator to concatenate two or more strings.
        // But the Java String class provides the concat() method. This method
        // combines a specific string at the end of another string,
        // and ultimately returns a combined string.

        //------By using concat method----
           str1 = "Learn ";
           String str3 = "Java";
         // concatenate str1 and str2
           System.out.println(str1.concat(str3)); // "Learn Java"

           // concatenate str2 and str11
           System.out.println(str2.concat(str1)); // "JavaLearn "
         //--- By using + operator---
           String s3 =  "hello";
           String s4 = "Learners";
         //  String s5 = s3.concat(s4); or
              String s5 = s3 + s4;
         //both of the above statement will give you the same result

          // Three strings are concatenated
           String message = "Welcome " + "to " + "Java";

         // String Chapter is concatenated with number 2
           String s = "Chapter" + 2; //  Chapter2

       // String Supplement is concatenated with character B
           s1 = "Supplement" + 'B'; // SupplementB

/********************************************************/
        // 7. split()
        //divides the string at the specified regex and returns
        //an array of substrings. The syntax of the string split() method is:
        //string.split(String regex, int limit)

        //regex - the string is divided at this regex (can be strings)
        //limit (optional) - controls the number of resulting substrings
        //If the limit parameter is not passed, split() returns all possible substrings.

        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result)); // [a, b, c, d:e]

        //Here, we split the string at ::
        // Since the limit parameter is not passed,
        // the returned array contains all the substrings.

/********************************************************/
        // 8.charAt()
        // Getting Characters From a String

        message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0)); // W

/********************************************************/
        // 9. compareTo()
        //compares the given string with the current string.
        // ‘Comparable’ interface that is implemented by the String class.
        // Either returns a positive number, a negative number, or 0.

        s1="hello";
        s2="hello";
        s3="hemlo";
        s4="flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        //The above program shows the comparison between the various Strings. Notice:
        //if s1 > s2, it returns a positive number.
        //if s1 < s2, it returns a negative number.
        //if s1 == s2, it returns 0.

/********************************************************/
        // 10. Substrings() method:
        // extracts a substring from the string and returns it.
        // The syntax of the substring() method is:
        // stringObj.substring(int startIndex, int endIndex)

        str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4)); // java

/********************************************************/
        // 11. indexOf()
        // returns the index of the first occurrence of
        // the specified character/substring within the string.

        str1 = "Java is fun";
       int result2;

       // getting index of character 's'
       result2 = str1.indexOf('s');

       System.out.println(result2); // 6

       // getting index of character 'J'
       result2 = str1.lastIndexOf('J');
       System.out.println(result2); // 0

       // the last occurrence of 'a' is returned
       result2 = str1.lastIndexOf('a');
       System.out.println(result2); // 3

       // character not in the string
       result2 = str1.lastIndexOf('j');
       System.out.println(result2); // -1

       // getting the last occurrence of "ava"
       result2 = str1.lastIndexOf("ava");
       System.out.println(result2); // 1

       // substring not in the string
       result2 = str1.lastIndexOf("java");
       System.out.println(result2); // -1

/********************************************************/
        // 12. contains()
        // The contains() method checks whether the specified string
        // (sequence of characters) is present in the string or not.

        str1 = "Learn Java";
        Boolean result3;

        // check if str1 contains "Java"
        result3 = str1.contains("Java");
        System.out.println(result3);  // true

        // check if str1 contains "Python"
        result3 = str1.contains("Python");
        System.out.println(result3);  // false

        // check if str1 contains ""
        result3 = str1.contains("");

        System.out.println(result3);  // true

/********************************************************/
        // 13. replace() method
        // replaces each matching occurrence of the old character/text
        // in the string with the new character/text.

        //The syntax of the replace() method is either:
        //stringobj.replace(char oldChar, char newChar)
        //or
        //stringobj.replace(CharSequence oldText, CharSequence newText)
        //Here, stringobj is an object of the String class.

        str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z')); // zbc cbz

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J')); // Java
        // character not in the string
        System.out.println("Hello".replace('4', 'J')); // Hello
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java")); // abc cba

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); // Java
        //Note: If the substring to be replaced is not in the string, replace() returns the original string.

/********************************************************/
        //14. replaceAll()
        // replaces each substring that matches the regex of the string
        // with the specified text.
        //The syntax of the replaceAll() method is:
        //string.replaceAll(String regex, String replacement)
        //regex - a regex (can be a typical string) that is to be replaced
        //replacement - matching substrings are replaced with this string

        str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric digits by a space
        System.out.println(str1.replaceAll(regex, " ")); // Java is fun

        //In the above example, "\\d+" is a regular expression that matches one or more digits.
        //
        //To learn more about regexes, visit Java Regex.

/********************************************************/
        //15. String Comparisons
        //We can compare String in Java based on content and reference.
        //It is used in authentication (by equals() method),
        // sorting (by compareTo() method),
        // and reference matching (by == operator) etc.
        //There are three ways to compare String in Java:
        //By Using equals() Method.
        //By Using == Operator.
        //By compareTo() Method.

/********************************************************/
        //16. By Using equals() Method
        // compares the original content of the string.
        // It compares the values of strings for equality.

       s1="PerScholas";
       s2="PerScholas";
       s3=new String("PerScholas");
       s4="Teksystem";
       System.out.println(s1.equals(s2));//true
       System.out.println(s1.equals(s3));//true
       System.out.println(s1.equals(s4));//false

/********************************************************/
        //17. By Using == operator
        //The == operator compares references, not values.
       s1="Perscholas";
       s2="Perscholas";
       s3=new String("Perscholas");
       System.out.println(s1==s2);//true (because both refer to same instance)
       System.out.println(s1==s3);//false(because s3 refers to instance created in non-pool heap)

/********************************************************/
        //18. By Using compareTo() method,
        // compares values lexicographically.
        // It returns an integer value that describes if
        // the first string is less than, equal to, or greater than the second string.
        // return 0 if this string is the same as another;
        // <0 if lexicographically less than another; or >0

        //Suppose s1 and s2 are two String objects. If:
        //s1 == s2 : The method returns 0.
        //s1 > s2 : The method returns a positive value.
        //s1 < s2 : The method returns a negative value.

       s1="Perscholas";
       s2="Perscholas";
       s3="Perschola";
       s4="PerscholasX";
       System.out.println(s1.compareTo(s2)); // 0
       System.out.println(s1.compareTo(s3)); // 1 (because s1>s3)
       System.out.println(s1.compareTo(s4)); // -1 (because s1<s4 )

    }
}
