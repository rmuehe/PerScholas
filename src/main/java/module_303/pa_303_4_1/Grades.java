package module_303.pa_303_4_1;

import static module_303.pa_303_4_1.LessThan10.readInput;

public class Grades {

    static String numToLetterGrade(int num) {
        return num > 100 || num < 0
                ? "Score out of range"
            : num >= 90
                ? "A"
            : num >= 80
                ? "B"
            : num >= 70
                ? "C"
            : num >= 60
                ? "D"
                : "F";
    }

    public static void main(String[] args) {
        System.out.println(numToLetterGrade(readInput())); // Outputs Letters or Out Of Range
    }
}
