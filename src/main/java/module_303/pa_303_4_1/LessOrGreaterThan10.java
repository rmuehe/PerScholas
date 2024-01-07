package module_303.pa_303_4_1;

public class LessOrGreaterThan10 extends LessThan10 {

    static String greaterThan10(int intToCheck) {
        if (intToCheck > 10) return "Greater than 10";
        return "";
    }

    static String lessOrGreaterThan10(int intToCheck) {
        return intToCheck > 10
                ? greaterThan10(intToCheck)
                : intToCheck < 10
                ? lessThan10(intToCheck)
                : "";
    }

    public static void main(String[] args) {

        System.out.println(lessOrGreaterThan10(7)); // "Less than 10"
        System.out.println(lessOrGreaterThan10(15)); // "Greater than 10"
    }
}