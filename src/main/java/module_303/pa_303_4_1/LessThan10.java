package module_303.pa_303_4_1;

import java.util.Scanner;

public class LessThan10 {
    public static final String LESS = "Less than 10";
    protected static int intToCheck;

    // Static method to set the value of intToCheck
    public static int readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        intToCheck = sc.nextInt();
        sc.close();
        return intToCheck;
    }

    public static String lessThan10(int intToCheck) {
        return intToCheck < 10 ? LESS : "";
    }

    public static void main(String[] args) {
        System.out.println(lessThan10(7)); // Less than 10
        System.out.println(lessThan10(15)); // ""
    }
}