package pa_303_2_3;

import java.util.Arrays;

public class BitwisePredictions {
    // #3 Write a program that declares three int variables: x, y, and z.
    // Assign 7 to x and 17 to y.
    // Write a comment that indicates what you predict
    // will be the result of the bitwise and operation on x and y.
    // Now use the bitwise AND (&) operator to derive the decimal and binary values,
    // and assign the result to z.

    public static int predictAmpersand(int x, int y) {
        int z = 0;
        char[] binaryX = Integer.toBinaryString(x).toCharArray();
        char[] binaryY = Integer.toBinaryString(y).toCharArray();
        StringBuilder mathStr = new StringBuilder();
        char[] longer = binaryX.length >= binaryY.length ? binaryX : binaryY;
        char[] shorter = binaryX.length < binaryY.length ? binaryX: binaryY;
        int length = longer.length;
        int shLength = shorter.length;
        for (byte i = 1; i <= length; i++) {
            if (i > shLength) {
                mathStr.append("0").append("+");
                continue;
            }
            if(longer[length - i] == '1' & shorter[shLength - i] == '1') {
                z += 1 << (i - 1);
                mathStr.append((1 << (i - 1))).append("+");
            } else {
                mathStr.append("0").append("+");
            }
        }
        return printAndReturnString(x, y, z, binaryX, binaryY, mathStr);
    }

    /* #4 Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
     As before, write a comment that indicates what you predict the values to be before printing them out. */

    public static int predictBitwiseOr(int x, int y) {
        int z = 0;
        char[] binaryX = Integer.toBinaryString(x).toCharArray();
        char[] binaryY = Integer.toBinaryString(y).toCharArray();
        StringBuilder mathStr = new StringBuilder();
        char[] longer = binaryX.length >= binaryY.length ? binaryX : binaryY;
        char[] shorter = binaryX.length < binaryY.length ? binaryX: binaryY;
        int length = longer.length;
        int shLength = shorter.length;
        for (byte i = 1; i <= length; i++) {
            if (i > shLength) {
                if(longer[length - i] == '1') {
                    z += 1 << (i - 1);
                    mathStr.append((1 << (i - 1))).append("+");
                } else {
                mathStr.append("0").append("+");
                }
                continue;
            }
            if(longer[length - i] == '1' | shorter[shLength - i] == '1') {
                z += 1 << (i - 1);
                mathStr.append((1 << (i - 1))).append("+");
            } else {
                mathStr.append("0").append("+");
            }
        }
        return printAndReturnString(x, y, z, binaryX, binaryY, mathStr);
    }

    private static int printAndReturnString(int x, int y, int z, char[] binaryX, char[] binaryY, StringBuilder mathStr) {
        mathStr.deleteCharAt(mathStr.length()-1);
        System.out.println(x + " in binary is " + Arrays.toString(binaryX));
        System.out.println(y + " in binary is " + Arrays.toString(binaryY));
        System.out.println(mathStr + " = " + z);
        return z;
    }

    // #5 Write a program that declares an integer variable, assigns a number,
    // and uses a postfix increment operator to increase the value.
    // Print the value before and after the increment operator.

    public static int predictPostfixIncrement(int x) {
        System.out.println("Integer is " + x + " before x++");
        System.out.println("Integer should be " + (x + 1) + " after");
        x++;
        System.out.println("Integer is " + x + " after x++");
        return x;
    }

    // #6
    // Write a program that demonstrates at least three ways to increment a variable by 1
    // and does this multiple times.
    // Assign a value to an integer variable,
    // print it,
    // increment by 1,
    // print it again,
    // increment by 1,
    // and then print it again.

    public static int incrementInt(int i, int times) {
        if (times == 4) {
            System.out.printf("integer == %d\n", i);
            ++i;
            System.out.printf("++%d == %d\n", i-1, i);
            i++;
            System.out.printf("%d++ == %d\n", i-1, i);
            i += 1;
            System.out.printf("%d += 1 == %d\n",i-1, i);
            i = i + 1;
            System.out.printf("%d = %d + 1 == %d\n", i-1, i-1, i);
        } else {
            i += times;
        }
        return i;
    }

    /* #7   Write a program that declares two integer variables:
            x, and y, and then assigns 5 to x and 8 to y.
            Create another variable sum and assign the value of ++x added to y, and print the result.
            Notice the value of the sum (should be 14).
            Now change the increment operator to postfix (x++) and re-run the program.
            Notice what the value of the sum is.
            The first configuration incremented x,
            and then calculated the sum,
            while the second configuration calculated the sum,
            and then incremented x.
     */

    private static int postOrPrefixIncrement(int x, int y, boolean isPrefix) {
        int sum;
        if (isPrefix) {
            sum = ++x + y;
        } else {
            sum = x++ + y;
        }
        return sum;
    }

    public static void printPostOrPrefixStatements(int x, int y) {
        System.out.printf("++%d + %d = %d\n", x, y, postOrPrefixIncrement(x,y,true));
        System.out.printf("%d++ + %d = %d\n", x, y, postOrPrefixIncrement(x,y,false));
    }


    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z = predictAmpersand(x,y);
        /*      7 in binary is [1, 1, 1]
                17 in binary is [1, 0, 0, 0, 1]
                1+0+0+0+0 = 1       */
        System.out.println( x & y); // 1

        predictBitwiseOr(x,y);
        /*      7 in binary is [1, 1, 1]
                17 in binary is [1, 0, 0, 0, 1]
                1+2+4+0+16 = 23     */
        System.out.println( x | y); // 23

        predictPostfixIncrement((int)(Math.random() * 100));
        /*      Integer is 36 before x++
                Integer should be 37 after
                Integer is 37 after x++     */

        incrementInt(0,4);
        /*      integer == 0
                ++0 == 1
                1++ == 2
                2 += 1 == 3
                3 = 3 + 1 == 4              */

        printPostOrPrefixStatements(5,8);
        /*      ++5 + 8 = 14
                5++ + 8 = 13                */

    }
}
