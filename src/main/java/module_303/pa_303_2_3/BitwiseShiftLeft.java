package pa_303_2_3;

import java.util.Objects;

import static pa_303_2_3.BitwiseShiftRightTwice.getStringBuilder;

/*  #1 Write a program that declares an integer a variable x,
    assigns the value 2 to it,
    and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
    Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
    Before printing the results, write a comment with the predicted decimal value and binary string.
    Now, print out x in decimal form and in binary notation.
    Perform the preceding exercise with the following values: 9, 17, 88
*/
public class BitwiseShiftLeft {
    public static String integerToBinaryString (int num) {
        return Integer.toBinaryString(num);
    }

    public static int shiftLeftInteger(int num) {
        return num << 1;
    }

    // Prints out binary numbers and shows them being shifted
    // returns the new number which should be double unless there's an overflow
    public static StringBuilder printShiftLeftPrediction(int num) {
        String binary = integerToBinaryString(num);
        System.out.println( num + " decimal in binary is: " + binary);
        binary += 0;
        System.out.println("Binary shifted left once is: " + binary);
        int math = 0;
        StringBuilder mathStr = new StringBuilder();
        String[] binaryArr = binary.split("");
        int i = binaryArr.length-1;
        // Because The first bit should be removed when negative with a fixed-length number
        int last = num >= 0 ? 0 : 1;
        for (int j = 0; i >= last; i--, j++) {
            if (Objects.equals(binaryArr[i], "1")) {
                math += 1 << j;
                mathStr.append((1 << j)).append("+");
            }
        }

        return getStringBuilder(num, math, mathStr);
    }


    public static void main(String[] args) {
        printShiftLeftPrediction(2); // 2 or 010 will become 4 or 0100
        printShiftLeftPrediction(-9); // 9 or 01001 will become 18 or 010010
        printShiftLeftPrediction(17); // 17 or 010001 will become 34 or 0100010
        printShiftLeftPrediction(88); // 88 or 01011000 will become 172 or 010110000
        printShiftLeftPrediction(Integer.MAX_VALUE);
        printShiftLeftPrediction(Integer.MIN_VALUE);
    }
}
