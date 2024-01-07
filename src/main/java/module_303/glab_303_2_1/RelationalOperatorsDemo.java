package glab_303_2_1;

import java.math.BigDecimal;

public class RelationalOperatorsDemo {
    int x, y, var1, var2, var3;
    String str1, str2, str3;

    public RelationalOperatorsDemo(int x, int y, String str1, String str2, String str3, int var1, int var2, int var3 ) {
        this.x = x;
        this.y = y;
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public static boolean isLong(double num) {
        long num2 = (long) num;
        return num2 == num;
    }

    public static String formatLong(long num) {
        return String.format("%s", num);
    }

    public static String formatDouble(double num) {
        // return String.format("%.0f", num);
        Double num2 = num;
        return num2.isInfinite() || num2.isNaN()
                ? num2.toString()
                : new BigDecimal(num2.toString())
                    .stripTrailingZeros()
                    .toPlainString();
    }

    public static String[] strArray(double x, double y) {
        String[] strings = new String[2];
        strings[0] = isLong(x) ? formatLong((long) x) : formatDouble(x);
        strings[1] = isLong(y) ? formatLong((long) y) : formatDouble(y);
        return strings;
    }

    public static String formattedPrint(double x, double y, String relationalStr, boolean bool ) {
        String[] fStrings = strArray(x,y);
        return "" + fStrings[0] + " " + relationalStr + " " + fStrings[1] + " : " + bool;
    }
    public static boolean greaterThan(double x, double y) {
        boolean greater = x > y;
        System.out.println(formattedPrint(x,y,">",greater));
        return greater;
    }

    public static boolean lessThan(double x, double y) {
        boolean lesser = x < y;
        System.out.println(formattedPrint(x,y,"<",lesser));
        return lesser;
    }

    public static boolean greaterThanOrEqual(double x, double y) {
        boolean greaterOrEqual = x >= y;
        System.out.println(formattedPrint(x,y,">=",greaterOrEqual));
        return greaterOrEqual;
    }

    public static boolean lesserThanOrEqual(double x, double y) {
        boolean lesserOrEqual = x <= y;
        System.out.println(formattedPrint(x,y,"<=",lesserOrEqual));
        return lesserOrEqual;
    }

    public static boolean equals(double x, double y) {
        boolean equality = x == y;
        System.out.println(formattedPrint(x,y,"==",equality));
        return equality;
    }

    public static boolean notEquals(double x, double y) {
        boolean notEquality = x != y;
        System.out.println(formattedPrint(x,y,"!=",notEquality));
        return notEquality;
    }

    public static String variableNameIsNumber(String variableName, double x) {
        System.out.printf("%s = %s\n", variableName, isLong(x)? formatLong((long) x) : formatDouble(x));
        return variableName + " = " + x;
    }

    public static String namedVariablesAreEqual(String var1, String var2, double n1, double n2) {
        String str = var1 + " == " + var2 + ": " + equals(n1, n2);
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        RelationalOperatorsDemo demo = new RelationalOperatorsDemo(
                10,5,
                "variable1", "variable2", "variable3",
                50, 100, 50);

        greaterThan(demo.x,demo.y); // 10 > 5 : true
        lessThan(demo.x,demo.y); // 10 < 5 : false
        greaterThanOrEqual(demo.x,demo.y); // 10 >= 5 : true
        lesserThanOrEqual(demo.x,demo.y); // 10 <= 5 : false
        equals(demo.x,demo.y); // 10 == 5 : false
        notEquals(demo.x,demo.y); // 10 != 5 : true
        variableNameIsNumber(demo.str1, demo.var1); // variable1 = 50
        variableNameIsNumber(demo.str2, demo.var2); // variable2 = 100
        variableNameIsNumber(demo.str3, demo.var3); // variable3 = 50
        namedVariablesAreEqual(demo.str1, demo.str2, demo.var1, demo.var2); // variable1 == variable2: false
        namedVariablesAreEqual(demo.str2, demo.str2, demo.var1, demo.var3); // variable1 == variable3: true
    }
}
