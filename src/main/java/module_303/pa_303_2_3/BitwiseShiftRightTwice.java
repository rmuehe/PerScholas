package pa_303_2_3;

import java.util.Objects;

public class BitwiseShiftRightTwice {

    /*  Write a program that declares a variable x, and assigns 150 to it,
        and prints out the binary string version of the number.
        Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        Write a comment indicating what you anticipate the decimal and binary values to be.
        Now print the value of x and the binary string.
        Perform the preceding exercise with the following values: 225, 1555, 32456
*/
    public static StringBuilder printShiftRightTwicePrediction(int num) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(num));
        System.out.println( num + " decimal in binary is: " + binary);
        int length = binary.length();
        binary.deleteCharAt(length-1);
        length--;
        binary.deleteCharAt(length-1);
        System.out.println("Binary shifted right twice is: " + binary);
        int math = 0;
        StringBuilder mathStr = new StringBuilder();
        int i = binary.length()-1;

        for (int j = 0; i >= 0; i--, j++) {
            if (Objects.equals(String.valueOf(binary.charAt(i)), "1")) {
                math += 1 << j;
                mathStr.append((1 << j)).append("+");
            }
        }

        return getStringBuilder(num, math, mathStr);
    }

    static StringBuilder getStringBuilder(int num, int math, StringBuilder mathStr) {
        if(mathStr.length() > 1) {
            mathStr.deleteCharAt(mathStr.length()-1);
            mathStr.append(" = ").append(math);
        } else if(mathStr.isEmpty()) {
            mathStr.append("0 = 0");
        }
        System.out.println("New number is " + mathStr);
        System.out.println(math + " & " + num + " have a difference of " + ((math - num) < 0 ? ((math - num) *-1) : math - num));
        return mathStr;
    }

    public static void main(String[] args) {
        printShiftRightTwicePrediction(150); // 150 or 10010110 will become 37 or 100101
            System.out.println(150/37.0); // 4.054054054054054

        printShiftRightTwicePrediction(225); // 225 or 011100001 will become 56 or 0111000
            System.out.println(225/56.0); // 4.017857142857143

        printShiftRightTwicePrediction(1555); // 1555 or 011000010011 will become 388 or 0110000100
            System.out.println(1555/388.0); // 4.007731958762887

        printShiftRightTwicePrediction(32456); // 32456 or 0111111011001000 will become 8114 or 01111110110010
            System.out.println(32456/8114.0); // 4.0

        printShiftRightTwicePrediction(Integer.MAX_VALUE); // 536870911
            System.out.println(2147483647/536870911.0); // 4.0000000055879354

        printShiftRightTwicePrediction(Integer.MIN_VALUE); // -536870912
            System.out.println(-2147483648/-536870911.0); // 4.000000007450581
    }
}
