package glab_303_2_1;

public class ArithmeticOperatorsDemo {
    private static int x;
    private static int y = 10;
    private static int z = 5;
    public static int addItems() {
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        return x;
    }

    public static int subtractItems() {
        x = y - z;
        System.out.println("- operator resulted in " + x);
        return x;
    }

    public static int multiplyItems() {
        x = y * z;
        System.out.println("* operator resulted in " + x);
        return x;
    }

    public static int divideItems() {
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        return x;
    }

    public static int moduloItems() {
        x = y % z;
        System.out.println("% operator resulted in " + x);
        return x;
    }

    public static int postfixIncrement() {
        x = y++;
        y--;
        System.out.println("Postfix ++ operator resulted in " + x);
        return x;
    }

    public static int prefixIncrement() {
        x = ++z;
        --z;
        System.out.println("Prefix ++ operator resulted in " + x);
        return x;
    }

    public static int negateItem() {
        x = -y;
        System.out.println("Negation - operator resulted in " + x);
        return x;
    }


    public static int tooBigInt() {
        System.out.println("Integer.MAX_VALUE + 1 resulted in -2147483648");
        System.out.println("Which is Integer.MIN_VALUE");
        return Integer.MAX_VALUE + 1;
    }

    public static int tooSmallInt() {
        System.out.println("Integer.MIN_VALUE - 1 resulted in 2147483647");
        System.out.println("Which is Integer.MAX_VALUE");
        return Integer.MIN_VALUE - 1;
    }

    public static double undefinedDouble() {
        double infinity = 1.0/0;
        System.out.println("1.0/0 resulted in " + infinity);
        return infinity;
    }

    public static float undefinedNegativeFloat() {
        float infinity = -1.0f/0;
        System.out.println("-1.0/0 resulted in " + infinity);
        return infinity;
    }

    public static double zeroDividedByZero() {
        double nan = 0/0.0;
        System.out.println("0/0.0 resulted in " + nan );
        return nan;
    }

    public static double truncatedIntegerDivision() {
        double truncated = 12 / 8;
        System.out.println("12/8 is 1 due to integer division");
        return truncated;
    }

    public static float floatDivide() {
        float notTruncated = 12 / 8.0f;
        System.out.println("12/8.0f is 1.5 due to floating point division");
        return notTruncated;
    }

    public static void main(String[] args) {
        addItems(); // + operator resulted in 15
        subtractItems(); // - operator resulted in 5
        multiplyItems(); // * operator resulted in 50
        divideItems(); // / + operator resulted in 2
        moduloItems(); // % + operator resulted in 0
        postfixIncrement(); // Postfix ++ + operator resulted in 10
        prefixIncrement(); // Prefix ++ operator resulted in 6
        negateItem(); // Negation - operator resulted in -10
        tooBigInt(); // Integer.MAX_VALUE + 1 resulted in -2147483648
        // Which is Integer.MIN_VALUE
        tooSmallInt(); // Integer.MIN_VALUE - 1 resulted in 2147483647
        // Which is Integer.MAX_VALUE
        undefinedDouble(); // 1.0/0 resulted in Infinity
        undefinedNegativeFloat(); // -1.0f/0 resulted in -Infinity
        zeroDividedByZero(); // 0/0.0 resulted in NaN
        truncatedIntegerDivision(); // 12 / 8 is 1 when due to integer division
        floatDivide(); // 12/8.0f is 1.5 due to floating point division
    }
}


