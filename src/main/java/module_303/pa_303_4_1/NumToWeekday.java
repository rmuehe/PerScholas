package module_303.pa_303_4_1;
import static module_303.pa_303_4_1.LessThan10.readInput;
public class NumToWeekday {

    static String numToWeekday (int num) {
        return switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Out of range";
        };
    }

    public static void main(String[] args) {
        System.out.println(numToWeekday(readInput())); // provides weekday per integer
    }
}
