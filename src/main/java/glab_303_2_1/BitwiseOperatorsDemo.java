package glab_303_2_1;

import java.util.Arrays;

public class BitwiseOperatorsDemo {

    // Gets the precise number of bits needed for an integer
    public static int bitsLength(int num) {
        // for setting isPositive to false if the input is negative
        boolean isPositive = true;


        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = Math.abs(num);
            isPositive = false;
        }
        if (num == 1) {
            return isPositive ? 1 : -1;
        }
        int exponent = 1;
        int lowPower = 2;
        int highPower = 4;
        if (num == lowPower) {
            return isPositive ? exponent + 1 : (exponent + 1) * -1;
        }

        while (num > lowPower) {
            if (num < highPower) {
                return isPositive ? exponent + 1 : (exponent + 1) * -1;
            }
            exponent++;
            lowPower = (int) Math.pow(2, exponent);
            highPower = (int) Math.pow(2, exponent + 1);
            if (highPower < 0) {
                return Integer.valueOf(-1);
            }
        }
        if (num == lowPower) {
            return isPositive ? exponent + 1 : (exponent + 1) * -1;
        }
        return Integer.valueOf(-1);
    }

    // Replaces a char at the index of the string
    public static String replaceCharAt(String str, int loc, char c) {
        char[] charArr = str.toCharArray();
        charArr[loc] = c;
        return String.valueOf(charArr);
    }

    // converts an integer to an integer as binary representation
    public static int intToBinary(int num) {
        Integer error = -1;
        boolean isPositive = true;
        if (Integer.valueOf(num) != num) {
            return error;
        }

        int length = Math.abs(bitsLength(num));
        if (num == -1 || num == 0 || num == 1) {
            return num;
        }
        if (num < -1) {
            num = Math.abs(num);
            isPositive = false;
        }

        String bits = "1";
        while (bits.length() < length) {
            bits += "0";
        }

        // check to see if num is an exponent of 2
        int checkPower = num;
        while (checkPower / 2 != 1) {
            if (checkPower % 2 != 0) {
                break;
            }
            checkPower /= 2;
        }

        if (checkPower == 2) {
            return isPositive ? Integer.valueOf(bits) : Integer.valueOf(bits) * -1;
        }

        int lowPower = (int) Math.pow(2, length - 1);
        int iterations = num - lowPower;

        for (; iterations > 0; iterations--) {
            String temp1 = String.valueOf(bits.charAt(length - 1));
            int tempLength = length;
            while (temp1.equals("1")) {
                bits = replaceCharAt(bits, tempLength - 1, '0');
                tempLength--;
                temp1 = String.valueOf(bits.charAt(tempLength - 1));
            }
            if (temp1.equals("0")) {
                bits = replaceCharAt(bits, tempLength - 1, '1');
            }
        }
        return isPositive ? Integer.valueOf(bits) : Integer.valueOf(bits) * -1;
    }
    /* bits per integer
     * 2   4   8  16  32  64
     * 2   3   4  5   6   7
     * */

    // 2^n
    /* 2^0 = 1   #
     *  2^1 = 2
     *  2^2 = 4
     *  2^3 = 8
     *  2^4 = 16
     * find the length of the string given an integer.
     * if integer is the exponent then length is n + 1 where 2 ^ n is the integer
     * if integer is not equal then length is determined by the lesser exponent between two
     *
     *  finding the length optimizes the solution.
     *  A number between 32 and 64 will always have a length of 6.
     *  Takes only a few iterations (and none before 32) to count to the target number
     *  32 = 100000
     *  33 = 100001
     *  34 = 100010
     * */

    /*
     * binary increments:
     * if the first number from the end is 0, then flip it to 1 and end
     * if not, then flip it to 0 and continue left
     * if the next number is 0, then flip it to 1 and end
     * if not, then flip it to 0 and continue left
     * */

    // because the loop always terminates before the first number, there's no problems
    // I.e., don't need to add a new bit to the front ever.






    // takes an int representation of a binary number ( -10 appearing like -1010 and 10 appearing like 1010)
    // and, if negative, converts that negative number into a binary number with a "1" at the front +1,
    // outputs as a string, otherwise converts a positive number to a binary string beginning with 0
    public static String negateBinary(int negativeBinary) {
        if (negativeBinary >= 0) {
            return "0" + negativeBinary;
        }
        negativeBinary *= -1;
        String negativeBinaryStr = String.valueOf(negativeBinary);
        char[] charArr = negativeBinaryStr.toCharArray();
        int[] intArr = new int[charArr.length + 1];
        int length = charArr.length;

        for (int i = 0; i < length; i++) {
            intArr[i + 1] = charArr[i] - '0';
        }

        // int locationOfFirstZero = length;
        while (!(length == 1) && intArr[length-1] == 1 ) {
            length--;
        }

        while (length > 0) {
            intArr[length-1] = intArr[length -1] == 0 ? 1 : 0;
            length--;
        }


        char[] newCharArr = new char[intArr.length];
        int i = 0;
        for (; i < intArr.length; i++) {
            newCharArr[i]  = (char)(intArr[i] + '0');
        }
        String binaryStr = String.valueOf(newCharArr);
        // return Integer.valueOf(binaryStr);
        return binaryStr;
    }

    public static String binaryIntToStringLiteral(int binary) {

        // converts int representation of binary literal like 1010 or -1010 (10 or -10) to a string.
        // the string would be the binary literal of that integer value, were it not a string.
        // no way to output a binary int like 0B1010 other than with a string
        // Java converts it to 10 if stored as a number type.

        // Add "0B" or "-0B" to the front of the integer.

        String binaryStr = String.valueOf(binary);
        return binary < 0 ? "-0" + replaceCharAt(binaryStr, 0, 'B') : "0B" + binaryStr;
    }

    // Returns an integer given a binary string of the form "-0B1010"
    public static int binaryStringLiteralToInteger(String binaryLiteral) {

        /* The below line is an alternate in-built way to get the returnInt from the string */
        // int returnInt = Integer.parseInt(binaryLiteral, 3, binaryLiteral.length(), 2);

        boolean isPositive = binaryLiteral.charAt(0) != '-';
        int returnInt = 0;
        int i = binaryLiteral.length();
        int j = isPositive ? 2 : 3;
        int k = 0;

        // Adds up the powers of two in the binary number to return the decimal value
        for(; i > j; i--) {
            if (binaryLiteral.charAt(i-1) == '1') {
//                System.out.println("returnInt is : " + returnInt);
//                System.out.println("Binary power is: " + k);
                returnInt +=  1 << k ;              /* equivalent to: */   // Math.pow(2,k);
//                System.out.println("1 << k is: " + (1 << k));
//                System.out.println("new returnInt is : " + returnInt);
            }
            k++;
        }
        return isPositive ? returnInt : returnInt * -1;
    }

    // binary addition
    //   1010  10
    //  +1010  10
    //  ------
    //  10100  20
    // if both false, then false (&)
    // if one true, then true (|)
    // if both true, then false (^)
    //      AND if the next is both false, then true
    //           ELSE  ...


    //  1110    14
    // +1011    11
    // -----
    // 11001    25
    // one true, so true (|)
    // both true, so false (^)
    //      AND carried one makes both true, so false (^)
    //          AND carried one does something interesting.
    //              If it's occupied by both, they would have been false (^)
    //              And carried over; when there's 3, 1 remains therefore. (|)
    //                  AND then the last number is carried (|)

    // Three operations, all seemingly XOR: only true when one true
    // 0 + 0 = 0
    // 1 + 0 = 1
    // 1 + 1 = 0 AND 1

    // Carried-1 operations
    // 1 + 0 + 0 = 1
    // 1 + 1 + 0 = 0 AND 1
    // 1 + 1 + 1 = 1 AND 1

    // Adding a new position when null

    // 7 total conditions.

     public static boolean[] binaryAddition(boolean[] b1, boolean[] b2) {
        byte len1 = (byte)(b1.length - 1);
        byte len2 = (byte)(b2.length - 1);
        boolean needExtra = false;
        boolean[] longer = len1 >= len2 ? b1: b2;
        boolean[] shorter = len1 < len2 ? b1: b2;
        byte i = (byte)(shorter.length - 1);
        boolean carry1 = false;

        for (; i > -1; i--) {
            if (carry1) {
                if (b1[i] & b2[i]) {
                    longer[i] = true;
                } else if (b1[i] ^ b2[i]) {
                    // carry1 = true;
                    longer[i] = false;
                } else {
                    longer[i] = true;
                    carry1 = false;
                }
            } else if (b1[i] & b2[i]) {
                carry1 = true;
                longer[i] = false;
            } else {
                longer[i] = b1[i] ^ b2[i];
            }

        }

        byte diff = (byte) ((len1 - len2 < 0 ? len2- len1 : len1 - len2) -1);
        if (carry1) {
            for(; diff > -1; diff--) {
                 if (!longer[diff]) {
                     longer[diff] = true;
                     break;
                 }
            }
            needExtra = diff == -1;
        }

        if (needExtra) {
            byte length = (byte)longer.length;
            boolean[] biggerArray = new boolean[length + 1];
            biggerArray[0] = true;
            for(byte j = 1; j < length; j++) {
                biggerArray[j] = longer[j - 1];
            }
            return biggerArray;
        }

        return longer;
     }


// Convert a binary integer representation to a boolean[].
    public static boolean[] binaryToBoolArray(int binary) {
        String binaryStr = String.valueOf(binary);
        byte length = (byte)binaryStr.length();
        boolean[] binaryArr = new boolean[length];

        for(byte i = 0; i < length; i++) {
            binaryArr[i] = binaryStr.charAt(i) == '1';
        }
        return binaryArr;
    }

    // Convert a boolean[] to an integer representation of a binary number ex: (-100, 1010)
    public static int boolArrayToBinaryInt(boolean[] boolArr) {
        int count = 0;
        byte length = (byte)(boolArr.length - 1);
        for (boolean bool: boolArr) {
            if (bool) {
                count += 1 << length;
            }
            length--;
        }
        return count;
    }






    public static void main(String[] args)
    {
        // System.out.println(intToBinary(10));
        for (int i = -7; i < 16; i++) {
            System.out.println(negateBinary(intToBinary(i)));
        }
        String negative258 = binaryIntToStringLiteral(intToBinary(-255));
        System.out.println(intToBinary(-258));
        System.out.println(negateBinary(intToBinary(-258)));
        System.out.println(negative258);
        System.out.println(binaryStringLiteralToInteger(negative258));


        boolean a = true;
        boolean b = false;


        boolean[] ten = {a,b,a,b};

        System.out.println(Arrays.toString(binaryToBoolArray(intToBinary(100))));
        System.out.println(Arrays.toString(binaryToBoolArray(intToBinary(156))));

        boolean[] hundred = binaryToBoolArray(intToBinary(100));
        boolean[] hundredFiftySix = binaryToBoolArray(intToBinary(156));

        System.out.println("MATH: " + Arrays.toString(binaryAddition(hundred, hundredFiftySix)));
        System.out.println("INTEGER= " + boolArrayToBinaryInt(binaryAddition(hundred, hundredFiftySix)));
        
        System.out.println("[true, false, true, false, false] should be 20: " + boolArrayToBinaryInt(new boolean[]{true, false, true, false, false}));
        System.out.println("MATH: " + Arrays.toString(binaryAddition(ten, ten))); // should be 10100 or {a,b,a,b,b}


        System.out.println("a & a should be true: " + (a & a) );
        System.out.println("a | a should be true: " + (a | a) );
        System.out.println("a ^ a should be false: " + (a ^ a) );

        System.out.println("a & b should be false: " + (a & b) );
        System.out.println("a | b should be true: " + (a | b) );
        System.out.println("a ^ b should be true: " + (a ^ b) );

//        System.out.println("a & a should be true: " + (a || null) );
//        System.out.println("a & a should be true: " + (a | a) );
//        System.out.println("a & a should be false: " + (a ^ a) );


        int x = 58; // 111010
        int y =13;  // 001101
        System.out.println("x & y : " + (x & y)); // returns 8 = 1000
        System.out.println("x | y : " + (x | y)); // 63=111111
        System.out.println("x ^ y : " + (x ^ y)); // 55=110111
        System.out.println("~x : " + (~x));  // -59
        System.out.println("x << y : " + (x << y)); // 475136
        System.out.println("x >> y : " + (x >> y)); // 0
    }
}
