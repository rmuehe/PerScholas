package module_303.pa_303_4_1;

public class LessOrGreaterThan10_Or20 extends LessOrGreaterThan10 {

    static String lessOrGreaterThan10_Or20(int intToCheck) {
        return intToCheck >= 20
                ? "Greater than or equal to 20"
            : intToCheck > 10
                ? "Between 10 and 20"
                : lessThan10(intToCheck);
    }

    public static void main(String[] args) {
        System.out.println(lessOrGreaterThan10_Or20(15)); // "Between 10 and 20"
        System.out.println(lessOrGreaterThan10_Or20(50)); // "Greater than or equal to 20"
    }
}
